package pie.ilikepiefoo.wrappergen.builder;

import pie.ilikepiefoo.wrappergen.JavaFileOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class MethodBuilder implements JavaFileOutput {
    private String name;
    private String returnType;
    private final List<String> args;
    private final List<String> body;
    private String accessModifier;
    private final List<String> modifiers;
    private final List<String> exceptions;
    private final List<String> annotations;
    private final List<String> generics;

    public MethodBuilder() {
        this.name = "method";
        this.returnType = "void";
        this.args = new ArrayList<>();
        this.body = new ArrayList<>();
        this.accessModifier = "public";
        this.modifiers = new ArrayList<>();
        this.exceptions = new ArrayList<>();
        this.annotations = new ArrayList<>();
        this.generics = new ArrayList<>();
    }

    public MethodBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MethodBuilder setReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }

    public MethodBuilder addArg(String arg) {
        this.args.add(arg);
        return this;
    }

    public MethodBuilder addArgs(String[] args) {
        this.args.addAll(Arrays.asList(args));
        return this;
    }

    public MethodBuilder setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
        return this;
    }

    public MethodBuilder addModifier(String modifier) {
        this.modifiers.add(modifier);
        return this;
    }

    public MethodBuilder addModifiers(String[] modifiers) {
        this.modifiers.addAll(Arrays.asList(modifiers));
        return this;
    }

    public MethodBuilder addBody(String line) {
        this.body.add(line);
        return this;
    }

    public MethodBuilder addBody(String[] lines) {
        this.body.addAll(Arrays.asList(lines));
        return this;
    }

    public MethodBuilder addException(String exception) {
        this.exceptions.add(exception);
        return this;
    }

    public MethodBuilder addExceptions(String[] exceptions) {
        this.exceptions.addAll(Arrays.asList(exceptions));
        return this;
    }

    public MethodBuilder addAnnotation(String annotation) {
        this.annotations.add(annotation);
        return this;
    }

    public MethodBuilder addAnnotations(String[] annotations) {
        this.annotations.addAll(Arrays.asList(annotations));
        return this;
    }

    public String toJavaFile(int indentLevel) {
        String indent = INDENTATION_STRING.repeat(indentLevel);
        StringBuilder method = new StringBuilder();
        StringJoiner joiner;
        for(String annotation : annotations) {
            method.append(indent).append(annotation).append('\n');
        }
        method.append(indent).append(accessModifier).append(" ");
        for(String modifier : modifiers) {
            method.append(modifier).append(" ");
        }
        if (!generics.isEmpty()) {
            joiner = new StringJoiner(", ", "<", ">");
            for(String generic : generics) {
                joiner.add(generic);
            }
            method.append(joiner);
            method.append(" ");
        }
        method.append(returnType).append(" ");

        method.append(name);
        joiner = new StringJoiner(", ", "(", ")");
        for(String arg : args) {
            joiner.add(arg);
        }
        method.append(joiner);
        for(String exception : exceptions) {
            method.append(" throws ").append(exception);
        }
        method.append(" {\n");
        for(String line : body) {
            method.append(indent).append(INDENTATION_STRING).append(line).append('\n');
        }
        method.append(indent).append("}\n");
        return method.toString();
    }


}
