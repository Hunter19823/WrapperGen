package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.example.PerfectlyNormalExampleClassWrapper;

public class Main {
    public static void main(String[] args) {
        PerfectlyNormalExampleClassWrapper<Integer> exampleWrapper = new PerfectlyNormalExampleClassWrapper<>();
        System.out.println(exampleWrapper.getPerfectlyNormalResult(5));
        exampleWrapper.getPerfectlyNormalResultNumberHandler.setCustomHandler(Main::getPerfectlyNormalResult);
        System.out.println(exampleWrapper.getPerfectlyNormalResult(5));
    }

    public static <T extends Number> T getPerfectlyNormalResult(T t) {
        System.out.println("Custom Handler");
        return t;
    }

}