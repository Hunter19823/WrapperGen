package pie.ilikepiefoo.wrappergen.util;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.FieldBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class MethodWrapper {
    private final Method method;
    private final FieldBuilder field;
    private final ClassBuilder wrapperType;
    private final MethodBuilder overrideMethod;
    private final Set<String> requiredImports;

    public MethodWrapper( Method method ) {
        this.method = method;
        this.wrapperType = GenerationUtils.createMethodHandler(method);
        this.field = new FieldBuilder().setName(GenerationUtils.getFieldName(this.wrapperType.getName()))
            .setType("%s<%s>".formatted(MethodOverrideHandler.class.getSimpleName(),
                this.wrapperType.getFormattedName()
            ))
            .setAccessModifier("public")
            .addModifiers("final");
        this.overrideMethod = GenerationUtils.createMethodBuilderFromMethod(method).addAnnotation(
            "@Override");
        this.overrideMethod.addBody((
            method.getReturnType().equals(Void.TYPE)
            ? ""
            : "return "
        ) + "this.%s.getHandler().%s%s;".formatted(this.field.getName(),
            GenerationUtils.getHandlerMethodName(this.method),
            GenerationUtils.getArgumentCall(this.overrideMethod.getArgs())
        ));
        this.requiredImports = new HashSet<>();
        for (var parameter : method.getParameters()) {
            var type = ReflectionTools.getImportName(parameter.getType());
            if (type != null) this.requiredImports.add(type);
        }
        this.requiredImports.add(MethodOverrideHandler.class.getCanonicalName());
    }

    public String getConstructorDeclaration() {
        return "this.%s = new %s<>(super::%s);".formatted(field.getName(),
            MethodOverrideHandler.class.getSimpleName(),
            this.method.getName()
        );
    }

    public Method getMethod() {
        return method;
    }

    public FieldBuilder getField() {
        return field;
    }

    public ClassBuilder getWrapperType() {
        return wrapperType;
    }

    public MethodBuilder getOverrideMethod() {
        return overrideMethod;
    }

    public Set<String> getRequiredImports() {
        return requiredImports;
    }

}
