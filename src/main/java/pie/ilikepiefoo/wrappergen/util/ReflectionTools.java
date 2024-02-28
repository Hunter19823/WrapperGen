package pie.ilikepiefoo.wrappergen.util;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringJoiner;

public class ReflectionTools {

    public static String getImportName(Class<?> type) {
        while (type.isArray()) {
            type = type.getComponentType();
        }
        if (type.isPrimitive() ||
            type == Object.class ||
            type == String.class ||
            type == Class.class) {
            return null;
        }
        return type.getCanonicalName();
    }

    public static String getParameterArgument(Parameter parameter) {
        String typeName = parameter.getParameterizedType().getTypeName();
        if (parameter.isVarArgs()) {
            // Remove the array brackets as we are using varargs.
            typeName = typeName.substring(0, typeName.length() - 2);
            typeName += "...";
        }
        return typeName +
            " " +
            parameter.getName();
    }

    public static String getGenericDefinition(Type type) {
        if (type instanceof Class<?> clazz) {
            return clazz.getCanonicalName();
        }
        if (type instanceof TypeVariable<?> variable) {
            var nonObjectBounds = Arrays.stream(variable.getBounds()).filter(b -> b != Object.class).toArray(Type[]::new);
            if (nonObjectBounds.length == 0) {
                return variable.getName();
            }
            StringJoiner joiner = new StringJoiner(" & ", " extends ", "");
            for (Type bound : nonObjectBounds) {
                joiner.add(bound.getTypeName());
            }
            return variable.getName() + joiner;
        }
        if (type instanceof WildcardType wildcardType) {
            if (wildcardType.getLowerBounds().length > 0) {
                return "? super " + wildcardType.getLowerBounds()[0].getTypeName();
            }
            if (wildcardType.getUpperBounds().length > 0) {
                return "? extends " + wildcardType.getUpperBounds()[0].getTypeName();
            }
            return "?";
        }
        return type.getTypeName();
    }

    public static Set<Type> getDependencies(Type type) {
        Set<Type> dependencies = new HashSet<>();
        Stack<Type> unprocessed = new Stack<>();
        unprocessed.push(type);
        while (!unprocessed.isEmpty()) {
            Type current = unprocessed.pop();
            if (dependencies.contains(current)) {
                continue;
            }
            dependencies.add(current);
            if (current instanceof Class<?> clazz) {
                if (clazz.isArray()) {
                    unprocessed.push(clazz.getComponentType());
                }
                for (var typeParam : clazz.getTypeParameters()) {
                    unprocessed.addAll(Arrays.asList(typeParam.getBounds()));
                }
            } else if (current instanceof TypeVariable<?> variable) {
                unprocessed.addAll(Arrays.asList(variable.getBounds()));
            } else if (current instanceof ParameterizedType parameterizedType) {
                unprocessed.addAll(Arrays.asList(parameterizedType.getActualTypeArguments()));
                unprocessed.push(parameterizedType.getRawType());
                unprocessed.push(parameterizedType.getOwnerType());
            } else if (current instanceof WildcardType wildcardType) {
                unprocessed.addAll(Arrays.asList(wildcardType.getLowerBounds()));
                unprocessed.addAll(Arrays.asList(wildcardType.getUpperBounds()));
            } else if (current instanceof GenericArrayType genericArrayType) {
                unprocessed.push(genericArrayType.getGenericComponentType());
            }
        }
        return dependencies;
    }

}
