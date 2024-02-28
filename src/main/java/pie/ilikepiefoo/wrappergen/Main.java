package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WrapperClassBuilder builder = new WrapperClassBuilder("CustomWrapper");
        builder.setPackageName("pie.ilikepiefoo.wrappergen.example");
        builder.addClassImplementation(List.class);
        System.out.println(builder.toJavaFile(0));
    }

}