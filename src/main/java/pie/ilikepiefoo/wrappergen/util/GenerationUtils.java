package pie.ilikepiefoo.wrappergen.util;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.ConstructorBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class GenerationUtils {

    public static ClassBuilder createMethodHandler(Method method, TypeVariableMap typeVariableMap) {
        ClassBuilder classBuilder = new ClassBuilder();
        // CamelCase the method name and add Handler to the end.
        classBuilder.setImports("");
        classBuilder.setName(NamingUtils.getMethodHandlerName(method));
        classBuilder.addAnnotations("@FunctionalInterface");
        classBuilder.setAccessModifier("public");
        classBuilder.setStructureType("interface");

        // Add the method to the interface.
        MethodBuilder methodBuilder = createMethodBuilderFromMethod(method, typeVariableMap)
            .setName(NamingUtils.getHandlerMethodName(method));
        Set<Type> METHOD_TYPE_PARAMETERS = new HashSet<>(Arrays.asList(method.getTypeParameters()));

        METHOD_TYPE_PARAMETERS.addAll(Arrays.asList(method.getTypeParameters()));
        for (var parameterType : method.getGenericParameterTypes()) {
                // Only add generics to class if the method does not contain that generic parameter.
            String[] generics = ReflectionTools
                .getDependencies(parameterType)
                .stream()
                .filter((type) -> type instanceof TypeVariable<?>)
                .map((type) -> (TypeVariable<?>) type)
                .filter((type) -> !METHOD_TYPE_PARAMETERS.contains(type))
                .map((type) -> ReflectionTools.getGenericDefinition(type, typeVariableMap))
                .toArray(String[]::new);
            classBuilder.addGenerics(
                generics
            );
        }
        String[] generics = ReflectionTools
            .getDependencies(method.getGenericReturnType())
            .stream()
            .filter((type) -> type instanceof TypeVariable<?>)
            .map((type) -> (TypeVariable<?>) type)
            .filter((type) -> !METHOD_TYPE_PARAMETERS.contains(type))
            .map((type) -> ReflectionTools.getGenericDefinition(type, typeVariableMap))
            .toArray(String[]::new);
        classBuilder.addGenerics(
            generics
        );

        classBuilder.addBody(methodBuilder.toJavaFile(2));
        return classBuilder;
    }

    public static MethodBuilder createMethodBuilderFromMethod(Method method, TypeVariableMap typeVariableMap) {
        MethodBuilder methodBuilder = new MethodBuilder()
            .setName(method.getName())
            .setReturnType(ReflectionTools.getGenericName(method.getGenericReturnType(), typeVariableMap))
            .setAccessModifier("public")
            .setIncludeMethodBody(false);

        for (var generic : method.getTypeParameters()) {
            methodBuilder.addGenerics(ReflectionTools.getGenericDefinition(generic, typeVariableMap));
        }
        for (var parameter : method.getParameters()) {
            methodBuilder.addArg(ReflectionTools.getParameterArgument(parameter, typeVariableMap));
        }

        return methodBuilder;
    }

    public static ConstructorBuilder createConstructorBuilderFromConstructor(Constructor<?> constructor, TypeVariableMap typeVariableMap) {
        ConstructorBuilder constructorBuilder = new ConstructorBuilder();
        for (var parameter : constructor.getParameters()) {
            constructorBuilder.addParameters(ReflectionTools.getParameterArgument(parameter, typeVariableMap));
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
