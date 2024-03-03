package pie.ilikepiefoo.wrappergen.util;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.ConstructorBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringJoiner;

public class GenerationUtils {

    public static ClassBuilder createMethodHandler(Method method, Map<TypeVariable<?>, TypeVariable<?>> typeVariableMap) {
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
                .map((type) -> {
                    if (typeVariableMap.containsKey(type)) {
                        return typeVariableMap.get(type);
                    }
                    return type;
                })
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
            .map((type) -> {
                if (typeVariableMap.containsKey(type)) {
                    return typeVariableMap.get(type);
                }
                return type;
            })
            .map((type) -> ReflectionTools.getGenericDefinition(type, typeVariableMap))
            .toArray(String[]::new);
        classBuilder.addGenerics(
            generics
        );

        classBuilder.addBody(methodBuilder.toJavaFile(2));
        return classBuilder;
    }

    public static MethodBuilder createMethodBuilderFromMethod(Method method, Map<TypeVariable<?>, TypeVariable<?>> typeVariableMap) {
        MethodBuilder methodBuilder = new MethodBuilder()
            .setName(method.getName())
            .setReturnType(ReflectionTools.getGenericDefinition(method.getGenericReturnType(), typeVariableMap))
            .setAccessModifier("public")
            .setIncludeMethodBody(false);

        for (var generic : method.getTypeParameters()) {
            methodBuilder.addGenerics(ReflectionTools.getGenericDefinition(typeVariableMap.getOrDefault(generic, generic), typeVariableMap));
        }
        for (var parameter : method.getParameters()) {
            methodBuilder.addArg(ReflectionTools.getParameterArgument(parameter, typeVariableMap));
        }

        return methodBuilder;
    }

    public static ConstructorBuilder createConstructorBuilderFromConstructor(Constructor<?> constructor) {
        ConstructorBuilder constructorBuilder = new ConstructorBuilder();
        for (var parameter : constructor.getParameters()) {
            constructorBuilder.addParameters(ReflectionTools.getParameterArgument(parameter, Map.of()));
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

    public static Map<TypeVariable<?>, TypeVariable<?>> createTypeVariableMap(Class<?> subject) {
        HashMap<TypeVariable<?>, TypeVariable<?>> typeVariableMap = new HashMap<>();
        Stack<Class<?>> unprocessed = new Stack<>();
        unprocessed.push(subject);
        while (!unprocessed.isEmpty()) {
            Class<?> current = unprocessed.pop();
            if (current.getSuperclass() != null) {
                unprocessed.push(current.getSuperclass());
                if (current.getGenericSuperclass() instanceof ParameterizedType parameterizedType) {
                    TypeVariable<?>[] typeVariables = ((Class<?>) parameterizedType.getRawType()).getTypeParameters();
                    Type[] actualTypes = parameterizedType.getActualTypeArguments();
                    for (int i = 0; i < typeVariables.length; i++) {
                        if (typeVariableMap.containsKey(typeVariables[i])) {
                            continue;
                        }
                        if (!(actualTypes[i] instanceof TypeVariable<?> actualType)) {
                            continue;
                        }
                        while (typeVariableMap.containsKey(actualType)) {
                            actualType = typeVariableMap.get(actualType);
                        }
                        typeVariableMap.put(typeVariables[i], actualType);
                    }
                }
            }
            unprocessed.addAll(Arrays.asList(current.getInterfaces()));
            for (Type type : current.getGenericInterfaces()) {
                if (!(type instanceof ParameterizedType parameterizedType)) {
                    continue;
                }
                TypeVariable<?>[] typeVariables = ((Class<?>) parameterizedType.getRawType()).getTypeParameters();
                Type[] actualTypes = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < typeVariables.length; i++) {
                    if (typeVariableMap.containsKey(typeVariables[i])) {
                        continue;
                    }
                    if (!(actualTypes[i] instanceof TypeVariable<?> actualType)) {
                        continue;
                    }
                    while (typeVariableMap.containsKey(actualType)) {
                        actualType = typeVariableMap.get(actualType);
                    }
                    typeVariableMap.put(typeVariables[i], actualType);
                }
            }
            unprocessed.addAll(Arrays.asList(current.getInterfaces()));
        }
        return typeVariableMap;
    }
}
