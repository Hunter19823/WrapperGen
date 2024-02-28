package pie.ilikepiefoo.wrappergen.example;

public class PerfectlyNormalExampleClass<T extends Number> {

    public <N extends T> N getPerfectlyNormalResult(N number) {
        return number;
    }
}
