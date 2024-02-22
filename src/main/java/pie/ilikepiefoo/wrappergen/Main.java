package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.FieldBuilder;
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

        FieldBuilder field = new FieldBuilder()
            .setName("MY_CONSTANT")
            .setType("String")
            .setAccessModifier("private")
            .addModifiers("final", "static")
            .addAnnotation("@SuppressWarnings(\"unchecked\")");
        System.out.println(field.toJavaFile(0));

        ClassBuilder classBuilder = new ClassBuilder()
            .setImports(importBuilder.toJavaFile(0))
            .setName("Main")
            .setAccessModifier("public")
            .addModifiers("final")
            .addAnnotations("@SuppressWarnings(\"unchecked\")")
            .addGenerics("T")
            .setSuperClass("Object")
            .addInterfaces("Runnable")
            .addBody(field.toJavaFile(1))
            .addBody(method.toJavaFile(1));
        System.out.println(classBuilder.toJavaFile(0));
    }

}