package pie.ilikepiefoo.wrappergen.builder;

import pie.ilikepiefoo.wrappergen.util.MethodWrapper;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringJoiner;
import java.util.TreeMap;

public class WrapperClassBuilder implements JavaFileOutput {
    private final ClassBuilder classBuilder;
    private final ImportBuilder importBuilder;
    private final SortedMap<String,FieldBuilder> fieldBuilders;
    private final List<ConstructorBuilder> constructorBuilders;
    private final SortedMap<String,MethodBuilder> methodBuilders;
    private final SortedMap<String,ClassBuilder> innerClassBuilders;
    private final List<String> constructorDeclarations;

    public WrapperClassBuilder( String name ) {
        this.importBuilder = new ImportBuilder();
        this.classBuilder = new ClassBuilder().setName(name);
        this.fieldBuilders = new TreeMap<>();
        this.constructorBuilders = new ArrayList<>();
        this.methodBuilders = new TreeMap<>();
        this.innerClassBuilders = new TreeMap<>();
        this.constructorDeclarations = new ArrayList<>();
    }

    public WrapperClassBuilder setPackageName( String packageName ) {
        this.importBuilder.setPackageName(packageName);
        return this;
    }

    public WrapperClassBuilder addClassImplementation( Class<?> subject ) {
        if (Modifier.isFinal(subject.getModifiers())) {
            throw new UnsupportedOperationException("Cannot inherit from a final class.");
        }
        if (Modifier.isStatic(subject.getModifiers())) {
            throw new UnsupportedOperationException("Cannot inherit from a static class.");
        }
        if (subject.isEnum()) {
            throw new UnsupportedOperationException("Cannot inherit from an enum.");
        }
        if (!subject.isInterface() && !this.classBuilder.getSuperClass().isBlank()) {
            throw new IllegalArgumentException("Class already has a superclass.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(subject.getName());
        if (subject.getTypeParameters().length > 0) {
            StringJoiner joiner = new StringJoiner(", ", "<", ">");
            for (int i = 0; i < subject.getTypeParameters().length; i++) {
                joiner.add(subject.getTypeParameters()[ i ].getTypeName());
                this.classBuilder.addGenerics(subject.getTypeParameters()[ i ].getTypeName());
            }
            sb.append(joiner);
        }
        if (!subject.isInterface()) {
            this.classBuilder.setSuperClass(sb.toString());
            var constructors = Arrays.stream(subject.getConstructors())
                .filter(constructor -> !Modifier.isPrivate(constructor.getModifiers()))
                .toList();
            for (var constructor : constructors) {
                var constructorBuilder = new ConstructorBuilder();
                constructorBuilder.setAccessModifier("public");
                constructorBuilder.setName(this.classBuilder.getName());
                for (var annotation : constructor.getAnnotations()) {
                    constructorBuilder.addAnnotations(annotation.annotationType().getSimpleName());
                    this.importBuilder.addImport(annotation.annotationType());
                }
                for (var typeParameter : constructor.getTypeParameters()) {
                    constructorBuilder.addGenerics(typeParameter.getTypeName());
                }
                for (var parameter : constructor.getParameters()) {
                    constructorBuilder.addParameters(parameter.getType().getSimpleName() +
                        " " +
                        parameter.getName());
                    this.importBuilder.addImport(parameter.getType());
                }
                this.constructorBuilders.add(constructorBuilder);
            }
        }
        else {
            this.classBuilder.addInterfaces(sb.toString());
        }
        this.importBuilder.addImport(subject);

        Arrays.stream(subject.getMethods())
            .filter(method -> !Modifier.isStatic(method.getModifiers()) &&
                !Modifier.isFinal(method.getModifiers()) &&
                !Modifier.isPrivate(method.getModifiers()))
            .map(MethodWrapper::new)
            .forEachOrdered(this::addMethodWrapper);
        return this;
    }

    public WrapperClassBuilder addMethodWrapper( MethodWrapper methodWrapper ) {
        if (this.methodBuilders.containsKey(methodWrapper.getOverrideMethod().getName())) {
            throw new IllegalArgumentException("Method with name " +
                methodWrapper.getOverrideMethod().getName() +
                " already exists.");
        }
        if (this.fieldBuilders.containsKey(methodWrapper.getField().getName())) {
            throw new IllegalArgumentException("Field with name " +
                methodWrapper.getField().getName() +
                " already exists.");
        }
        if (this.innerClassBuilders.containsKey(methodWrapper.getWrapperType().getName())) {
            throw new IllegalArgumentException("Inner class with name " +
                methodWrapper.getWrapperType().getName() +
                " already exists.");
        }
        this.addField(methodWrapper.getField());
        this.constructorDeclarations.add(methodWrapper.getConstructorDeclaration());
        this.addMethod(methodWrapper.getOverrideMethod());
        this.addInnerClass(methodWrapper.getWrapperType());
        this.importBuilder.addImports(methodWrapper.getRequiredImports());
        for (ConstructorBuilder constructorBuilder : this.constructorBuilders) {
            constructorBuilder.addBody(methodWrapper.getConstructorDeclaration());
        }

        return this;
    }

    public WrapperClassBuilder addField( FieldBuilder... fieldBuilders ) {
        for (var field : fieldBuilders) {
            if (this.fieldBuilders.containsKey(field.getName())) {
                throw new IllegalArgumentException("Field with name " +
                    field.getName() +
                    " already exists.");
            }
            this.fieldBuilders.put(field.getName(), field);
        }
        return this;
    }

    public WrapperClassBuilder addMethod( MethodBuilder... methodBuilders ) {
        for (MethodBuilder methodBuilder : methodBuilders) {
            if (this.methodBuilders.containsKey(methodBuilder.getName())) {
                throw new IllegalArgumentException("Method with name " +
                    methodBuilder.getName() +
                    " already exists.");
            }
        }
        return this;
    }

    public WrapperClassBuilder addInnerClass( ClassBuilder... innerClassBuilders ) {
        for (ClassBuilder innerClassBuilder : innerClassBuilders) {
            if (this.innerClassBuilders.containsKey(innerClassBuilder.getName())) {
                throw new IllegalArgumentException("Inner class with name " +
                    innerClassBuilder.getName() +
                    " already exists.");
            }
            this.innerClassBuilders.put(innerClassBuilder.getName(), innerClassBuilder);
        }
        return this;
    }

    public WrapperClassBuilder addConstructor( ConstructorBuilder... constructorBuilders ) {
        this.constructorBuilders.addAll(List.of(constructorBuilders));
        for (ConstructorBuilder constructorBuilder : constructorBuilders) {
            for (String declaration : constructorDeclarations) {
                constructorBuilder.addBody(declaration);
            }
        }
        return this;
    }

    public ImportBuilder getImportBuilder() {
        return importBuilder;
    }

    public ClassBuilder getClassBuilder() {
        return classBuilder;
    }

    public Map<String,FieldBuilder> getFieldBuilders() {
        return fieldBuilders;
    }

    public List<ConstructorBuilder> getConstructorBuilders() {
        return constructorBuilders;
    }

    public Map<String,MethodBuilder> getMethodBuilders() {
        return methodBuilders;
    }

    public Map<String,ClassBuilder> getInnerClassBuilders() {
        return innerClassBuilders;
    }

    public List<String> getConstructorDeclarations() {
        return constructorDeclarations;
    }

    @Override
    public String toJavaFile( int indentLevel ) {
        var temp = this.classBuilder.getBody();
        this.classBuilder.setImports(this.importBuilder.toJavaFile(indentLevel));
        for (FieldBuilder fieldBuilder : this.fieldBuilders.values()) {
            temp.add(fieldBuilder.toJavaFile(indentLevel + 1));
        }
        for (ConstructorBuilder constructorBuilder : this.constructorBuilders) {
            temp.add(constructorBuilder.toJavaFile(indentLevel + 1));
        }
        for (MethodBuilder methodBuilder : this.methodBuilders.values()) {
            temp.add(methodBuilder.toJavaFile(indentLevel + 1));
        }
        for (ClassBuilder innerClassBuilder : this.innerClassBuilders.values()) {
            temp.add(innerClassBuilder.toJavaFile(indentLevel + 1));
        }
        String output = this.classBuilder.toJavaFile(indentLevel);
        this.classBuilder.setBody(temp);
        return output;
    }

}
