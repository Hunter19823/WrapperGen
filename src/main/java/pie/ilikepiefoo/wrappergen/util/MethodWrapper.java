package pie.ilikepiefoo.wrappergen.util;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.FieldBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

public class MethodWrapper {
    private final Method method;
    private final FieldBuilder field;
    private final ClassBuilder wrapperType;
    private final MethodBuilder overrideMethod;
    private final Set<String> requiredImports;

    public MethodWrapper(Method method, Map<TypeVariable<?>, TypeVariable<?>> typeVariableMap) {
        this.method = method;
        this.wrapperType = GenerationUtils.createMethodHandler(method, typeVariableMap);
        StringJoiner stringJoiner = new StringJoiner(", ", "<", ">");
        for (var generic : this.wrapperType.getGenerics()) {
            if (generic.contains(" ")) {
                stringJoiner.add(generic.substring(0, generic.indexOf(" ")));
            } else {
                stringJoiner.add(generic);
            }
        }
        this.field = new FieldBuilder().setName(NamingUtils.getFieldName(this.wrapperType.getName()))
            .setType("%s<%s>".formatted(
                MethodOverrideHandler.class.getSimpleName(),
                this.wrapperType.getName() + (this.wrapperType.getGenerics().isEmpty() ? "" : stringJoiner.toString())
            ))
            .setAccessModifier("public")
            .addModifiers("final");
        this.overrideMethod = GenerationUtils.createMethodBuilderFromMethod(method, typeVariableMap).addAnnotation(
            "@Override");
        this.overrideMethod.addBody((
            method.getReturnType().equals(Void.TYPE)
                ? ""
                : "return "
        ) + "this.%s.getHandler().%s%s;".formatted(this.field.getName(),
            NamingUtils.getHandlerMethodName(this.method),
            NamingUtils.getArgumentCall(this.overrideMethod.getArgs())
        ));
        this.requiredImports = new HashSet<>();
        for (var parameter : method.getParameters()) {
            var type = ReflectionTools.getImportName(parameter.getType());
            if (type != null) {
                this.requiredImports.add(type);
            }
        }
        this.requiredImports.add(MethodOverrideHandler.class.getCanonicalName());
    }

    public String getConstructorDeclaration() {
        if (Modifier.isAbstract(method.getModifiers())) {
            return "this.%s = new %s<>();".formatted(field.getName(),
                MethodOverrideHandler.class.getSimpleName()
            );
        }
        if (method.isDefault() && method.getDeclaringClass().isInterface()) {
            return "this.%s = new %s<>(this::%s);".formatted(field.getName(),
                MethodOverrideHandler.class.getSimpleName(),
                this.method.getName()
            );
        }
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
