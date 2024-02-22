package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.ImportBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

public class Main {
    public static void main( String[] args ) {
        ImportBuilder importBuilder = new ImportBuilder()
            .addImport("java.util.*")
            .addImport("java.io.*");

        System.out.println(importBuilder.toJavaFile(0));

        MethodBuilder method = new MethodBuilder()
            .setName("main")
            .setReturnType("void")
            .addArg("String[] args")
            .addBody("System.out.println(\"Hello world!\");")
            .setAccessModifier("public")
            .addModifier("static");
        System.out.println(method.toJavaFile(0));
    }

}