package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;
import pie.ilikepiefoo.wrappergen.example.CustomWrapper;

public class Main {
    public static void main(String[] args) {
        CustomWrapper<Double> arrayListWrapper = new CustomWrapper<>();
        arrayListWrapper.add(5.0);
        arrayListWrapper.add(10.0);
        System.out.println(arrayListWrapper.get(0));
        System.out.println(arrayListWrapper.get(1));
        arrayListWrapper.getintHandler.setCustomHandler(
            (index) -> {
                var value = arrayListWrapper.getintHandler.getSuperHandler().onGet(index);
                System.out.println("The get method was called with index " + index + " and returned " + value);
                return value;
            }
        );
        System.out.println(arrayListWrapper.get(0));
        System.out.println(arrayListWrapper.get(1));

    }

    public static void generateWrapperClass(Class<?> subject) {

        WrapperClassBuilder builder = new WrapperClassBuilder("CustomWrapper");
        builder.setPackageName("pie.ilikepiefoo.wrappergen.example");
        builder.addClassImplementation(subject);
        System.out.println(builder.toJavaFile(0));
    }

}