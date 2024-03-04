package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;
public class ExampleClassWrapper<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>, G extends T, F extends H, H extends java.util.List<F>> extends ExampleClass<T, G, F, H> {
    public final MethodOverrideHandler<CalculateGenericObjectHandler> calculateGenericObjectHandler;
    public final MethodOverrideHandler<ComplexGenericExampleNumberHandler> complexGenericExampleNumberHandler;
    public final MethodOverrideHandler<EqualsObjectHandler> equalsObjectHandler;
    public final MethodOverrideHandler<GetAgeHandler> getAgeHandler;
    public final MethodOverrideHandler<GetComplexGenericHandler> getComplexGenericHandler;
    public final MethodOverrideHandler<GetGenericHandler<T>> getGenericHandler;
    public final MethodOverrideHandler<GetNameHandler> getNameHandler;
    public final MethodOverrideHandler<GetPITAGenericNavigableMapObjectHandler<T>> getPITAGenericNavigableMapObjectHandler;
    public final MethodOverrideHandler<HashCodeHandler> hashCodeHandler;
    public final MethodOverrideHandler<SetAgedoubleHandler> setAgedoubleHandler;
    public final MethodOverrideHandler<SetAgeintHandler> setAgeintHandler;
    public final MethodOverrideHandler<SetGenericNavigableMapHandler<T>> setGenericNavigableMapHandler;
    public final MethodOverrideHandler<SetMixedGenericsNumberNavigableMapHandler<T>> setMixedGenericsNumberNavigableMapHandler;
    public final MethodOverrideHandler<SetNameStringHandler> setNameStringHandler;
    public final MethodOverrideHandler<ToStringHandler> toStringHandler;
    public final MethodOverrideHandler<VarArgGenericExampleObjectHandler> varArgGenericExampleObjectHandler;
    public final MethodOverrideHandler<VarArgsExampleStringHandler> varArgsExampleStringHandler;
    public ExampleClassWrapper(java.lang.String arg0, int arg1, T arg2) {
        super(arg0, arg1, arg2);
        this.varArgGenericExampleObjectHandler = new MethodOverrideHandler<>(super::varArgGenericExample);
        this.complexGenericExampleNumberHandler = new MethodOverrideHandler<>(super::complexGenericExample);
        this.getAgeHandler = new MethodOverrideHandler<>(super::getAge);
        this.setMixedGenericsNumberNavigableMapHandler = new MethodOverrideHandler<>(super::setMixedGenerics);
        this.setAgedoubleHandler = new MethodOverrideHandler<>(super::setAge);
        this.setAgeintHandler = new MethodOverrideHandler<>(super::setAge);
        this.getPITAGenericNavigableMapObjectHandler = new MethodOverrideHandler<>(super::getPITAGeneric);
        this.setGenericNavigableMapHandler = new MethodOverrideHandler<>(super::setGeneric);
        this.varArgsExampleStringHandler = new MethodOverrideHandler<>(super::varArgsExample);
        this.getComplexGenericHandler = new MethodOverrideHandler<>(super::getComplexGeneric);
        this.getGenericHandler = new MethodOverrideHandler<>(super::getGeneric);
        this.calculateGenericObjectHandler = new MethodOverrideHandler<>(super::calculateGeneric);
        this.getNameHandler = new MethodOverrideHandler<>(super::getName);
        this.setNameStringHandler = new MethodOverrideHandler<>(super::setName);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
    }

    public ExampleClassWrapper(java.lang.String arg0, int arg1) {
        super(arg0, arg1);
        this.varArgGenericExampleObjectHandler = new MethodOverrideHandler<>(super::varArgGenericExample);
        this.complexGenericExampleNumberHandler = new MethodOverrideHandler<>(super::complexGenericExample);
        this.getAgeHandler = new MethodOverrideHandler<>(super::getAge);
        this.setMixedGenericsNumberNavigableMapHandler = new MethodOverrideHandler<>(super::setMixedGenerics);
        this.setAgedoubleHandler = new MethodOverrideHandler<>(super::setAge);
        this.setAgeintHandler = new MethodOverrideHandler<>(super::setAge);
        this.getPITAGenericNavigableMapObjectHandler = new MethodOverrideHandler<>(super::getPITAGeneric);
        this.setGenericNavigableMapHandler = new MethodOverrideHandler<>(super::setGeneric);
        this.varArgsExampleStringHandler = new MethodOverrideHandler<>(super::varArgsExample);
        this.getComplexGenericHandler = new MethodOverrideHandler<>(super::getComplexGeneric);
        this.getGenericHandler = new MethodOverrideHandler<>(super::getGeneric);
        this.calculateGenericObjectHandler = new MethodOverrideHandler<>(super::calculateGeneric);
        this.getNameHandler = new MethodOverrideHandler<>(super::getName);
        this.setNameStringHandler = new MethodOverrideHandler<>(super::setName);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
    }

    @Override
    public T getGeneric() {
        return this.getGenericHandler.getHandler().onGetGeneric();
    }

    @Override
    public void setGeneric(T arg0) {
        this.setGenericNavigableMapHandler.getHandler().onSetGeneric(arg0);
    }

    @Override
    public java.lang.String getName() {
        return this.getNameHandler.getHandler().onGetName();
    }
    @Override
    public int getAge() {
        return this.getAgeHandler.getHandler().onGetAge();
    }
    @Override
    public <COMPLEX_GENERIC extends java.lang.Number> COMPLEX_GENERIC getComplexGeneric() {
        return this.getComplexGenericHandler.getHandler().onGetComplexGeneric();
    }

    @Override
    public void setName(java.lang.String arg0) {
        this.setNameStringHandler.getHandler().onSetName(arg0);
    }

    @Override
    public void setAge(double arg0) {
        this.setAgedoubleHandler.getHandler().onSetAge(arg0);
    }
    @Override
    public <L, M, N extends T> L getPITAGeneric(T arg0, L arg1) {
        return this.getPITAGenericNavigableMapObjectHandler.getHandler().onGetPITAGeneric(arg0, arg1);
    }

    @Override
    public <G> void calculateGeneric(G arg0) {
        this.calculateGenericObjectHandler.getHandler().onCalculateGeneric(arg0);
    }

    @Override
    public void varArgsExample(java.lang.String... arg0) {
        this.varArgsExampleStringHandler.getHandler().onVarArgsExample(arg0);
    }
    @Override
    public void setAge(int arg0) {
        this.setAgeintHandler.getHandler().onSetAge(arg0);
    }

    @Override
    public <T> T varArgGenericExample(T... arg0) {
        return this.varArgGenericExampleObjectHandler.getHandler().onVarArgGenericExample(arg0);
    }

    @Override
    public <COMPLEX_GENERIC extends java.lang.Number> void complexGenericExample(COMPLEX_GENERIC arg0) {
        this.complexGenericExampleNumberHandler.getHandler().onComplexGenericExample(arg0);
    }

    @Override
    public <COMPLEX_GENERIC extends java.lang.Number> void setMixedGenerics(COMPLEX_GENERIC arg0, T arg1) {
        this.setMixedGenericsNumberNavigableMapHandler.getHandler().onSetMixedGenerics(arg0, arg1);
    }
    @Override
    public java.lang.String toString() {
        return this.toStringHandler.getHandler().onToString();
    }

    @Override
    public int hashCode() {
        return this.hashCodeHandler.getHandler().onHashCode();
    }

    @Override
    public boolean equals(java.lang.Object arg0) {
        return this.equalsObjectHandler.getHandler().onEquals(arg0);
    }
    @FunctionalInterface
    public interface CalculateGenericObjectHandler {
        <G> void onCalculateGeneric(G arg0);
    }

    @FunctionalInterface
    public interface ComplexGenericExampleNumberHandler {
        <COMPLEX_GENERIC extends java.lang.Number> void onComplexGenericExample(COMPLEX_GENERIC arg0);
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface GetAgeHandler {
        int onGetAge();
    }

    @FunctionalInterface
    public interface GetComplexGenericHandler {
        <COMPLEX_GENERIC extends java.lang.Number> COMPLEX_GENERIC onGetComplexGeneric();
    }

    @FunctionalInterface
    public interface GetGenericHandler<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>> {
        T onGetGeneric();
    }

    @FunctionalInterface
    public interface GetNameHandler {
        java.lang.String onGetName();
    }

    @FunctionalInterface
    public interface GetPITAGenericNavigableMapObjectHandler<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>> {
        <L, M, N extends T> L onGetPITAGeneric(T arg0, L arg1);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface SetAgedoubleHandler {
        void onSetAge(double arg0);
    }

    @FunctionalInterface
    public interface SetAgeintHandler {
        void onSetAge(int arg0);
    }

    @FunctionalInterface
    public interface SetGenericNavigableMapHandler<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>> {
        void onSetGeneric(T arg0);
    }

    @FunctionalInterface
    public interface SetMixedGenericsNumberNavigableMapHandler<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>> {
        <COMPLEX_GENERIC extends java.lang.Number> void onSetMixedGenerics(COMPLEX_GENERIC arg0, T arg1);
    }

    @FunctionalInterface
    public interface SetNameStringHandler {
        void onSetName(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        java.lang.String onToString();
    }

    @FunctionalInterface
    public interface VarArgGenericExampleObjectHandler {
        <T> T onVarArgGenericExample(T... arg0);
    }

    @FunctionalInterface
    public interface VarArgsExampleStringHandler {
        void onVarArgsExample(java.lang.String... arg0);
    }

}
