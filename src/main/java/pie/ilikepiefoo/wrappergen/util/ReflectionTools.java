package pie.ilikepiefoo.wrappergen.util;

import java.lang.reflect.Parameter;

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

}
