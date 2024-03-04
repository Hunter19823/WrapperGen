package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
import pie.ilikepiefoo.wrappergen.util.MethodHotSwapHandler;

public class PerfectlyNormalExampleClassWrapper<T extends Number> extends PerfectlyNormalExampleClass<T> {
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler = new MethodHotSwapHandler<>(super::equals);
    public MethodHandler<GetPerfectlyNormalResultNumberHandler<T>> getPerfectlyNormalResultNumberHandler = new MethodHotSwapHandler<>(super::getPerfectlyNormalResult);
    public MethodHandler<HashCodeHandler> hashCodeHandler = new MethodHotSwapHandler<>(super::hashCode);
    public MethodHandler<ToStringHandler> toStringHandler = new MethodHotSwapHandler<>(super::toString);
    public PerfectlyNormalExampleClassWrapper() {
        super();
    }

    @Override
    public boolean equals(Object arg0) {
        return (this.equalsObjectHandler != null && this.equalsObjectHandler.getHandler() != null) ? this.equalsObjectHandler.getHandler().onEquals(arg0) : super.equals(arg0);
    }
    @Override
    public <N extends T> N getPerfectlyNormalResult(N arg0) {
        return (this.getPerfectlyNormalResultNumberHandler != null && this.getPerfectlyNormalResultNumberHandler.getHandler() != null) ? this.getPerfectlyNormalResultNumberHandler.getHandler().onGetPerfectlyNormalResult(arg0) : super.getPerfectlyNormalResult(arg0);
    }
    @Override
    public int hashCode() {
        return (this.hashCodeHandler != null && this.hashCodeHandler.getHandler() != null) ? this.hashCodeHandler.getHandler().onHashCode() : super.hashCode();
    }
    @Override
    public String toString() {
        return (this.toStringHandler != null && this.toStringHandler.getHandler() != null) ? this.toStringHandler.getHandler().onToString() : super.toString();
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
