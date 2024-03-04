package pie.ilikepiefoo.wrappergen.example;

public class ExampleClassBuilder<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>, G extends T, F extends H, H extends java.util.List<F>> {
    public CalculateGenericObjectHandler calculateGenericObjectHandler;
    public ComplexGenericExampleNumberHandler complexGenericExampleNumberHandler;
    public EqualsObjectHandler equalsObjectHandler;
    public GetAgeHandler getAgeHandler;
    public GetComplexGenericHandler getComplexGenericHandler;
    public GetGenericHandler<T> getGenericHandler;
    public GetNameHandler getNameHandler;
    public GetPITAGenericNavigableMapObjectHandler<T> getPITAGenericNavigableMapObjectHandler;
    public HashCodeHandler hashCodeHandler;
    public SetAgeDoubleHandler setAgeDoubleHandler;
    public SetAgeIntHandler setAgeIntHandler;
    public SetGenericNavigableMapHandler<T> setGenericNavigableMapHandler;
    public SetMixedGenericsNumberNavigableMapHandler<T> setMixedGenericsNumberNavigableMapHandler;
    public SetNameStringHandler setNameStringHandler;
    public ToStringHandler toStringHandler;
    public VarArgGenericExampleObjectHandler varArgGenericExampleObjectHandler;
    public VarArgsExampleStringHandler varArgsExampleStringHandler;
    public ExampleClassBuilder() {
    }

    public ExampleClassBuilder<T, G, F, H> setCalculateGenericObjectHandler(CalculateGenericObjectHandler calculateGenericObjectHandler) {
        this.calculateGenericObjectHandler = calculateGenericObjectHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setComplexGenericExampleNumberHandler(ComplexGenericExampleNumberHandler complexGenericExampleNumberHandler) {
        this.complexGenericExampleNumberHandler = complexGenericExampleNumberHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setEqualsObjectHandler(EqualsObjectHandler equalsObjectHandler) {
        this.equalsObjectHandler = equalsObjectHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setGetAgeHandler(GetAgeHandler getAgeHandler) {
        this.getAgeHandler = getAgeHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setGetComplexGenericHandler(GetComplexGenericHandler getComplexGenericHandler) {
        this.getComplexGenericHandler = getComplexGenericHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setGetGenericHandler(GetGenericHandler<T> getGenericHandler) {
        this.getGenericHandler = getGenericHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setGetNameHandler(GetNameHandler getNameHandler) {
        this.getNameHandler = getNameHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setGetPITAGenericNavigableMapObjectHandler(GetPITAGenericNavigableMapObjectHandler<T> getPITAGenericNavigableMapObjectHandler) {
        this.getPITAGenericNavigableMapObjectHandler = getPITAGenericNavigableMapObjectHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setHashCodeHandler(HashCodeHandler hashCodeHandler) {
        this.hashCodeHandler = hashCodeHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setSetAgeDoubleHandler(SetAgeDoubleHandler setAgeDoubleHandler) {
        this.setAgeDoubleHandler = setAgeDoubleHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setSetAgeIntHandler(SetAgeIntHandler setAgeIntHandler) {
        this.setAgeIntHandler = setAgeIntHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setSetGenericNavigableMapHandler(SetGenericNavigableMapHandler<T> setGenericNavigableMapHandler) {
        this.setGenericNavigableMapHandler = setGenericNavigableMapHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setSetMixedGenericsNumberNavigableMapHandler(SetMixedGenericsNumberNavigableMapHandler<T> setMixedGenericsNumberNavigableMapHandler) {
        this.setMixedGenericsNumberNavigableMapHandler = setMixedGenericsNumberNavigableMapHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setSetNameStringHandler(SetNameStringHandler setNameStringHandler) {
        this.setNameStringHandler = setNameStringHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setToStringHandler(ToStringHandler toStringHandler) {
        this.toStringHandler = toStringHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setVarArgGenericExampleObjectHandler(VarArgGenericExampleObjectHandler varArgGenericExampleObjectHandler) {
        this.varArgGenericExampleObjectHandler = varArgGenericExampleObjectHandler;
        return this;
    }
    public ExampleClassBuilder<T, G, F, H> setVarArgsExampleStringHandler(VarArgsExampleStringHandler varArgsExampleStringHandler) {
        this.varArgsExampleStringHandler = varArgsExampleStringHandler;
        return this;
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
    public interface SetAgeDoubleHandler {
        void onSetAge(double arg0);
    }

    @FunctionalInterface
    public interface SetAgeIntHandler {
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
