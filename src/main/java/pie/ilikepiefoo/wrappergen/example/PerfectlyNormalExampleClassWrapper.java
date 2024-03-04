package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;
public class PerfectlyNormalExampleClassWrapper<T extends java.lang.Number> extends PerfectlyNormalExampleClass<T> {
    public final MethodOverrideHandler<EqualsObjectHandler> equalsObjectHandler;
    public final MethodOverrideHandler<GetPerfectlyNormalResultNumberHandler<T>> getPerfectlyNormalResultNumberHandler;
    public final MethodOverrideHandler<HashCodeHandler> hashCodeHandler;
    public final MethodOverrideHandler<ToStringHandler> toStringHandler;
    public PerfectlyNormalExampleClassWrapper() {
        super();
        this.getPerfectlyNormalResultNumberHandler = new MethodOverrideHandler<>(super::getPerfectlyNormalResult);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
    }

    @Override
    public boolean equals(java.lang.Object arg0) {
        return this.equalsObjectHandler.getHandler().onEquals(arg0);
    }
    @Override
    public <N extends T> N getPerfectlyNormalResult(N arg0) {
        return this.getPerfectlyNormalResultNumberHandler.getHandler().onGetPerfectlyNormalResult(arg0);
    }
    @Override
    public int hashCode() {
        return this.hashCodeHandler.getHandler().onHashCode();
    }
    @Override
    public java.lang.String toString() {
        return this.toStringHandler.getHandler().onToString();
    }
    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface GetPerfectlyNormalResultNumberHandler<T extends java.lang.Number> {
        <N extends T> N onGetPerfectlyNormalResult(N arg0);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface ToStringHandler {
        java.lang.String onToString();
    }

}
