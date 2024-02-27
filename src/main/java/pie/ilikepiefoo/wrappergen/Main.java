package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.ConstructorBuilder;
import pie.ilikepiefoo.wrappergen.builder.FieldBuilder;
import pie.ilikepiefoo.wrappergen.builder.ImportBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;
import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;
import pie.ilikepiefoo.wrappergen.example.ExampleClass;

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

        ConstructorBuilder constructor = new ConstructorBuilder().addAnnotations(
                "@SuppressWarnings(\"unchecked\")")
            .addGenerics("T")
            .addParameters("String name")
            .addParameters("T genericField")
            .addBody("this.name = name;")
            .addBody("this.genericField = genericField;");
        System.out.println(constructor.toJavaFile(0));

        FieldBuilder genericField = new FieldBuilder().setName("genericField")
            .setType("T")
            .setAccessModifier("private");
        System.out.println(genericField.toJavaFile(0));

        MethodBuilder getGenericField = new MethodBuilder().setName("getGenericField")
            .setReturnType("T")
            .setAccessModifier("public")
            .addBody("return this.genericField;");

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
            .addBody(genericField.toJavaFile(1))
            .addBody(constructor.toJavaFile(1))
            .addBody(method.toJavaFile(1))
            .addBody(getGenericField.toJavaFile(1));
        System.out.println(classBuilder.toJavaFile(0));

        WrapperClassBuilder wrapperClassBuilder =
            new WrapperClassBuilder("ExampleClassWrapper").setPackageName(
            "pie.ilikepiefoo.wrappergen.example").addClassImplementation(ExampleClass.class);
        System.out.println(wrapperClassBuilder.toJavaFile(0));
    }

}