package pie.ilikepiefoo.wrappergen.util;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.ConstructorBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

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
        Set<Type> METHOD_TYPE_PARAMETERS = new HashSet<>(Arrays.asList(method.getTypeParameters()));

        METHOD_TYPE_PARAMETERS.addAll(Arrays.asList(method.getTypeParameters()));
        for (var parameterType : method.getGenericParameterTypes()) {
            if (parameterType instanceof TypeVariable<?> variable) {
                // Only add generics to class if the method does not contain that generic parameter.
                if (!METHOD_TYPE_PARAMETERS.contains(variable)) {
                    classBuilder.addGenerics(variable.toString());
                }
            }
        }
        if (method.getGenericReturnType() instanceof TypeVariable<?> variable) {
            if (!METHOD_TYPE_PARAMETERS.contains(variable)) {
                classBuilder.addGenerics(variable.toString());
            }
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
        for (var parameter : method.getParameters()) {
            methodBuilder.addArg(ReflectionTools.getParameterArgument(parameter));
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

    public static ConstructorBuilder createConstructorBuilderFromConstructor(Constructor<?> constructor) {
        ConstructorBuilder constructorBuilder = new ConstructorBuilder();
        for (var parameter : constructor.getParameters()) {
            constructorBuilder.addParameters(ReflectionTools.getParameterArgument(parameter));
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
