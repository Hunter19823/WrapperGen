package pie.ilikepiefoo.wrappergen.util;

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

}
