package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;

public class PerfectlyNormalExampleClassWrapper<T extends java.lang.Number> extends PerfectlyNormalExampleClass<T> {
    public final MethodOverrideHandler<GetPerfectlyNormalResultNumberHandler<T>> getPerfectlyNormalResultNumberHandler;

    public PerfectlyNormalExampleClassWrapper() {
        super();
        this.getPerfectlyNormalResultNumberHandler = new MethodOverrideHandler<>(super::getPerfectlyNormalResult);
    }

    @Override
    public <N extends T> N getPerfectlyNormalResult(N number) {
        return getPerfectlyNormalResultNumberHandler.getHandler().onGetPerfectlyNormalResult(number);
    }

    @FunctionalInterface
    public interface GetPerfectlyNormalResultNumberHandler<T extends java.lang.Number> {
        <N extends T> N onGetPerfectlyNormalResult( N arg0 );
    }

}