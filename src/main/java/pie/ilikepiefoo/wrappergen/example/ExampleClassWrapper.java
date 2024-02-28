package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;

public class ExampleClassWrapper<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>, G extends T, F extends H, H extends java.util.List<F>> extends pie.ilikepiefoo.wrappergen.example.ExampleClass<T, G, F, H> {
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
        this.setGenericNavigableMapHandler = new MethodOverrideHandler<>(super::setGeneric);
        this.getGenericHandler = new MethodOverrideHandler<>(super::getGeneric);
        this.getAgeHandler = new MethodOverrideHandler<>(super::getAge);
        this.setAgeintHandler = new MethodOverrideHandler<>(super::setAge);
        this.setAgedoubleHandler = new MethodOverrideHandler<>(super::setAge);
        this.calculateGenericObjectHandler = new MethodOverrideHandler<>(super::calculateGeneric);
        this.setMixedGenericsNumberNavigableMapHandler = new MethodOverrideHandler<>(super::setMixedGenerics);
        this.getPITAGenericNavigableMapObjectHandler = new MethodOverrideHandler<>(super::getPITAGeneric);
        this.varArgsExampleStringHandler = new MethodOverrideHandler<>(super::varArgsExample);
        this.getComplexGenericHandler = new MethodOverrideHandler<>(super::getComplexGeneric);
        this.varArgGenericExampleObjectHandler = new MethodOverrideHandler<>(super::varArgGenericExample);
        this.complexGenericExampleNumberHandler = new MethodOverrideHandler<>(super::complexGenericExample);
        this.getNameHandler = new MethodOverrideHandler<>(super::getName);
        this.setNameStringHandler = new MethodOverrideHandler<>(super::setName);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
    }

    public ExampleClassWrapper(java.lang.String arg0, int arg1) {
        super(arg0, arg1);
        this.setGenericNavigableMapHandler = new MethodOverrideHandler<>(super::setGeneric);
        this.getGenericHandler = new MethodOverrideHandler<>(super::getGeneric);
        this.getAgeHandler = new MethodOverrideHandler<>(super::getAge);
        this.setAgeintHandler = new MethodOverrideHandler<>(super::setAge);
        this.setAgedoubleHandler = new MethodOverrideHandler<>(super::setAge);
        this.calculateGenericObjectHandler = new MethodOverrideHandler<>(super::calculateGeneric);
        this.setMixedGenericsNumberNavigableMapHandler = new MethodOverrideHandler<>(super::setMixedGenerics);
        this.getPITAGenericNavigableMapObjectHandler = new MethodOverrideHandler<>(super::getPITAGeneric);
        this.varArgsExampleStringHandler = new MethodOverrideHandler<>(super::varArgsExample);
        this.getComplexGenericHandler = new MethodOverrideHandler<>(super::getComplexGeneric);
        this.varArgGenericExampleObjectHandler = new MethodOverrideHandler<>(super::varArgGenericExample);
        this.complexGenericExampleNumberHandler = new MethodOverrideHandler<>(super::complexGenericExample);
        this.getNameHandler = new MethodOverrideHandler<>(super::getName);
        this.setNameStringHandler = new MethodOverrideHandler<>(super::setName);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
    }

    @FunctionalInterface
    public interface CalculateGenericObjectHandler {
        <G> void onCalculateGeneric( G arg0 );
    }

    @FunctionalInterface
    public interface ComplexGenericExampleNumberHandler {
        <COMPLEX_GENERIC extends java.lang.Number> void onComplexGenericExample( COMPLEX_GENERIC arg0 );
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals( java.lang.Object arg0 );
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
        <L, M, N extends T> L onGetPITAGeneric( T arg0, L arg1 );
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface SetAgedoubleHandler {
        void onSetAge( double arg0 );
    }

    @FunctionalInterface
    public interface SetAgeintHandler {
        void onSetAge( int arg0 );
    }

    @FunctionalInterface
    public interface SetGenericNavigableMapHandler<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>> {
        void onSetGeneric( T arg0 );
    }

    @FunctionalInterface
    public interface SetMixedGenericsNumberNavigableMapHandler<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>> {
        <COMPLEX_GENERIC extends java.lang.Number> void onSetMixedGenerics(
            COMPLEX_GENERIC arg0,
            T arg1
        );
    }

    @FunctionalInterface
    public interface SetNameStringHandler {
        void onSetName( java.lang.String arg0 );
    }

    @FunctionalInterface
    public interface ToStringHandler {
        java.lang.String onToString();
    }

    @FunctionalInterface
    public interface VarArgGenericExampleObjectHandler {
        <T> T onVarArgGenericExample( T... arg0 );
    }

    @FunctionalInterface
    public interface VarArgsExampleStringHandler {
        void onVarArgsExample( java.lang.String... arg0 );
    }

}