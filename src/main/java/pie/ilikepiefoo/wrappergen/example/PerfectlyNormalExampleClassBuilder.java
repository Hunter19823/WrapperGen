package pie.ilikepiefoo.wrappergen.example;

public class PerfectlyNormalExampleClassBuilder<T extends Number> {
    public EqualsObjectHandler equalsObjectHandler;
    public GetPerfectlyNormalResultNumberHandler<T> getPerfectlyNormalResultNumberHandler;
    public HashCodeHandler hashCodeHandler;
    public ToStringHandler toStringHandler;
    public PerfectlyNormalExampleClassBuilder() {
    }

    public PerfectlyNormalExampleClassBuilder<T> setEqualsObjectHandler(EqualsObjectHandler equalsObjectHandler) {
        this.equalsObjectHandler = equalsObjectHandler;
        return this;
    }
    public PerfectlyNormalExampleClassBuilder<T> setGetPerfectlyNormalResultNumberHandler(GetPerfectlyNormalResultNumberHandler<T> getPerfectlyNormalResultNumberHandler) {
        this.getPerfectlyNormalResultNumberHandler = getPerfectlyNormalResultNumberHandler;
        return this;
    }
    public PerfectlyNormalExampleClassBuilder<T> setHashCodeHandler(HashCodeHandler hashCodeHandler) {
        this.hashCodeHandler = hashCodeHandler;
        return this;
    }
    public PerfectlyNormalExampleClassBuilder<T> setToStringHandler(ToStringHandler toStringHandler) {
        this.toStringHandler = toStringHandler;
        return this;
    }
    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(Object arg0);
    }

    @FunctionalInterface
    public interface GetPerfectlyNormalResultNumberHandler<T extends Number> {
        <N extends T> N onGetPerfectlyNormalResult(N arg0);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface ToStringHandler {
        String onToString();
    }

}
