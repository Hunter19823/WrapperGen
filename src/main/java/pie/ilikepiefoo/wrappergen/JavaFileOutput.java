package pie.ilikepiefoo.wrappergen;

public interface JavaFileOutput {
    public static String INDENTATION_STRING = "    ";

    public String toJavaFile(int indentLevel);
}
