package pie.ilikepiefoo.wrappergen.util;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.ConstructorBuilder;
import pie.ilikepiefoo.wrappergen.builder.ImportBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class GenerationUtils {

    public static ClassBuilder createMethodHandler(Method method) {
        ClassBuilder classBuilder = new ClassBuilder();
        // CamelCase the method name and add Handler to the end.
        classBuilder.setImports("");
        classBuilder.setName(getMethodHandlerName(method));
        classBuilder.addAnnotations("@FunctionalInterface");
        classBuilder.setAccessModifier("public");
        classBuilder.setStructureType("interface");

        // Add the method to the interface.
        MethodBuilder methodBuilder = createMethodBuilderFromMethod(method).setName(
            getHandlerMethodName(method));
        for (var parameterType : method.getGenericParameterTypes()) {
            if (parameterType instanceof TypeVariable<?> variable) {
                // Only add generics to class if the method does not contain that generic parameter.
                boolean contains = false;
                for (var generic : method.getTypeParameters()) {
                    if (generic.equals(variable)) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    classBuilder.addGenerics(variable.toString());
                }
            }
        }
        if (method.getGenericReturnType() instanceof TypeVariable<?> variable) {
            classBuilder.addGenerics(variable.toString());
        }

        classBuilder.addBody(methodBuilder.toJavaFile(2));
        return classBuilder;
    }

    public static String getMethodHandlerName(Method method) {
        return method.getName().substring(0, 1).toUpperCase() +
            method.getName().substring(1) +
            getUniqueName(method.getParameters()) +
            "Handler";
    }

    public static MethodBuilder createMethodBuilderFromMethod(Method method) {
        MethodBuilder methodBuilder = new MethodBuilder().setName(method.getName()).setReturnType(
                method.getGenericReturnType().getTypeName())
            .setAccessModifier("public")
            .setIncludeMethodBody(false);

        for (var generic : method.getTypeParameters()) {
            methodBuilder.addGenerics(generic.getName());
        }
        for (var parameters : method.getParameters()) {
            methodBuilder.addArg(parameters.getParameterizedType().getTypeName() +
                " " +
                parameters.getName());
        }

        return methodBuilder;
    }

    public static String getHandlerMethodName(Method method) {
        return "on" +
            method.getName().substring(0, 1).toUpperCase() +
            method.getName().substring(1);
    }

    public static String getUniqueName(Parameter[] parameters) {
        StringBuilder name = new StringBuilder();
        for (var parameter : parameters) {
            name.append(parameter.getType().getSimpleName());
        }
        return name.toString().replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String getArgumentCall(List<String> args) {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        args.forEach((arg) -> joiner.add(arg.split(" ")[1]));
        return joiner.toString();
    }

    public static String getFieldName(String handlerName) {
        // Return method handler name with first character lowercase.
        return handlerName.substring(0, 1).toLowerCase() + handlerName.substring(1);
    }

    public static ClassBuilder createWrapperClass(Class<?> clazz, int indentLevel) {
        if (Modifier.isFinal(clazz.getModifiers())) {
            throw new IllegalArgumentException("Cannot wrap a final class.");
        }
        if (Modifier.isStatic(clazz.getModifiers())) {
            throw new IllegalArgumentException("Cannot wrap a static class.");
        }
        ImportBuilder importBuilder = new ImportBuilder();
        ClassBuilder classBuilder = new ClassBuilder();
        String wrapperClassName = clazz.getSimpleName() + "Wrapper";
        classBuilder.setName(wrapperClassName);
        classBuilder.setAccessModifier("public");
        classBuilder.setStructureType("class");
        importBuilder.addImport(clazz.getCanonicalName());
        if (Modifier.isInterface(clazz.getModifiers())) {
            classBuilder.addInterfaces(clazz.getSimpleName());
        } else {
            classBuilder.setSuperClass(clazz.getSimpleName());
        }
        Set<String> requiredImports = new TreeSet<>();
        List<MethodWrapper> methodWrappers = new ArrayList<>();

        Arrays.stream(clazz.getMethods())
            .filter(method -> !Modifier.isStatic(method.getModifiers()) &&
                !Modifier.isFinal(method.getModifiers()) &&
                !Modifier.isPrivate(method.getModifiers()))
            .forEachOrdered((method) -> {
                var wrapper = new MethodWrapper(method);
                methodWrappers.add(wrapper);
                requiredImports.addAll(wrapper.getRequiredImports());
            });

        List<ConstructorBuilder> constructorBuilders = new ArrayList<>();

        Arrays.stream(clazz.getConstructors())
            .filter(constructor -> !Modifier.isPrivate(constructor.getModifiers()))
            .forEachOrdered((constructor) -> {
                var constructorBuilder = createConstructorBuilderFromConstructor(constructor);
                constructorBuilders.add(constructorBuilder);
                for (var param : constructor.getParameters()) {
                    var importName = ReflectionTools.getImportName(param.getType());
                    if (importName != null) {
                        requiredImports.add(importName);
                    }
                }
                for (var wrapper : methodWrappers) {
                    constructorBuilder.addBody(wrapper.getConstructorDeclaration());
                }
            });
        for (var methodWrapper : methodWrappers) {
            classBuilder.addBody(methodWrapper.getField().toJavaFile(indentLevel + 1));
        }
        for (var constructorBuilder : constructorBuilders) {
            constructorBuilder.setName(wrapperClassName);
            classBuilder.addBody(constructorBuilder.toJavaFile(indentLevel + 1));
        }
        for (var methodWrapper : methodWrappers) {
            classBuilder.addBody(methodWrapper.getOverrideMethod().toJavaFile(indentLevel + 1));
        }

        for (var methodWrapper : methodWrappers) {
            classBuilder.addBody(methodWrapper.getWrapperType().toJavaFile(indentLevel + 1));
        }
        for (var required : requiredImports) {
            importBuilder.addImport(required);
        }

        classBuilder.setImports(importBuilder.toJavaFile(indentLevel));


        return classBuilder;
    }

    public static ConstructorBuilder createConstructorBuilderFromConstructor(Constructor<?> constructor) {
        ConstructorBuilder constructorBuilder = new ConstructorBuilder();
        for (var parameter : constructor.getParameters()) {
            constructorBuilder.addParameters(parameter.getParameterizedType().getTypeName() +
                " " +
                parameter.getName());
        }
        for (var typeParameters : constructor.getTypeParameters()) {
            constructorBuilder.addGenerics(typeParameters.toString());
        }
        // Add super call to constructor.
        StringJoiner joiner = new StringJoiner(", ", "super(", ");");
        for (var parameter : constructor.getParameters()) {
            joiner.add(parameter.getName());
        }
        constructorBuilder.addBody(joiner.toString());
        return constructorBuilder;
    }

}
