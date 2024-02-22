package pie.ilikepiefoo.wrappergen.builder;

import pie.ilikepiefoo.wrappergen.JavaFileOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ClassBuilder implements JavaFileOutput {
    private String imports;
    private final List<String> annotations;
    private String accessModifier;
    private final List<String> modifiers;
    private String name;
    private final List<String> generics;
    private String superClass;
    private final List<String> interfaces;
    private final List<String> body;

    public ClassBuilder() {
        this.imports = new ImportBuilder().toJavaFile(0);
        this.name = "class";
        this.accessModifier = "public";
        this.modifiers = new ArrayList<>();
        this.annotations = new ArrayList<>();
        this.generics = new ArrayList<>();
        this.superClass = "";
        this.interfaces = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public ClassBuilder setImports( String imports ) {
        this.imports = imports;
        return this;
    }

    public ClassBuilder setName( String name ) {
        this.name = name;
        return this;
    }

    public ClassBuilder setAccessModifier( String accessModifier ) {
        this.accessModifier = accessModifier;
        return this;
    }

    public ClassBuilder addModifiers( String... modifiers ) {
        this.modifiers.addAll(List.of(modifiers));
        return this;
    }

    public ClassBuilder addAnnotations( String... annotations ) {
        this.annotations.addAll(List.of(annotations));
        return this;
    }

    public ClassBuilder addGenerics( String... generics ) {
        this.generics.addAll(List.of(generics));
        return this;
    }

    public ClassBuilder setSuperClass( String superClass ) {
        this.superClass = superClass;
        return this;
    }

    public ClassBuilder addInterfaces( String... interfaces ) {
        this.interfaces.addAll(List.of(interfaces));
        return this;
    }

    public ClassBuilder addBody( String... body ) {
        this.body.addAll(List.of(body));
        return this;
    }


    @Override
    public String toJavaFile( int indentLevel ) {
        String indent = INDENTATION_STRING.repeat(indentLevel);
        String bodyIndent = INDENTATION_STRING.repeat(indentLevel+1);
        StringBuilder sb = new StringBuilder();
        StringJoiner joiner;
        sb.append(this.imports);
        for(String annotation : this.annotations)
        {
            sb.append(indent).append(annotation).append('\n');
        }
        sb.append(indent).append(this.accessModifier).append(" ");
        for(String modifier : this.modifiers)
        {
            sb.append(modifier).append(" ");
        }
        sb.append(this.name);
        if (!this.generics.isEmpty()) {
            joiner = new StringJoiner(", ", "<", ">");
            for(String generic : this.generics) {
                joiner.add(generic);
            }
            sb.append(joiner);
        }
        sb.append(" ");
        if (!this.superClass.isEmpty()) {
            sb.append("extends ").append(this.superClass).append(" ");
        }
        if (!this.interfaces.isEmpty()) {
            joiner = new StringJoiner(", ", "implements ", " ");
            for(String interfaceName : this.interfaces) {
                joiner.add(interfaceName);
            }
            sb.append(joiner);
        }
        sb.append("{\n");
        for(String line : this.body)
        {
            sb.append(line).append('\n');
        }
        sb.append(indent).append("}\n");
        return sb.toString();
    }
}
