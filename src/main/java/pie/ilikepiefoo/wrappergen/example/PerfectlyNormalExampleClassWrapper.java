package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
public class PerfectlyNormalExampleClassWrapper<T extends java.lang.Number> extends PerfectlyNormalExampleClass<T> {
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler;
    public MethodHandler<GetPerfectlyNormalResultNumberHandler<T>> getPerfectlyNormalResultNumberHandler;
    public MethodHandler<HashCodeHandler> hashCodeHandler;
    public MethodHandler<ToStringHandler> toStringHandler;
    public PerfectlyNormalExampleClassWrapper() {
        super();
    }

    @Override
    public boolean equals(java.lang.Object arg0) {
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
    public java.lang.String toString() {
        return (this.toStringHandler != null && this.toStringHandler.getHandler() != null) ? this.toStringHandler.getHandler().onToString() : super.toString();
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
