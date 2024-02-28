package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;
import pie.ilikepiefoo.wrappergen.example.ExampleClass;

public class Main {
    public static void main(String[] args) {
        WrapperClassBuilder wrapperClassBuilder =
            new WrapperClassBuilder("ExampleClassWrapper").setPackageName(
                "pie.ilikepiefoo.wrappergen.example").addClassImplementation(ExampleClass.class);
        System.out.println(wrapperClassBuilder.toJavaFile(0));
    }

}