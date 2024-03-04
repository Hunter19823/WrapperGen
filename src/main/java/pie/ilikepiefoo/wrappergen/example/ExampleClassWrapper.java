package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
import pie.ilikepiefoo.wrappergen.util.MethodHotSwapHandler;
public class ExampleClassWrapper<T extends java.util.NavigableMap<java.lang.String, java.util.List<java.util.Set<T>>>, G extends T, F extends H, H extends java.util.List<F>> extends ExampleClass<T, G, F, H> {
    public MethodHandler<CalculateGenericObjectHandler> calculateGenericObjectHandler = new MethodHotSwapHandler<>(super::calculateGeneric);
    public MethodHandler<ComplexGenericExampleNumberHandler> complexGenericExampleNumberHandler = new MethodHotSwapHandler<>(super::complexGenericExample);
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler = new MethodHotSwapHandler<>(super::equals);
    public MethodHandler<GetAgeHandler> getAgeHandler = new MethodHotSwapHandler<>(super::getAge);
    public MethodHandler<GetComplexGenericHandler> getComplexGenericHandler = new MethodHotSwapHandler<>(super::getComplexGeneric);
    public MethodHandler<GetGenericHandler<T>> getGenericHandler = new MethodHotSwapHandler<>(super::getGeneric);
    public MethodHandler<GetNameHandler> getNameHandler = new MethodHotSwapHandler<>(super::getName);
    public MethodHandler<GetPITAGenericNavigableMapObjectHandler<T>> getPITAGenericNavigableMapObjectHandler = new MethodHotSwapHandler<>(super::getPITAGeneric);
    public MethodHandler<HashCodeHandler> hashCodeHandler = new MethodHotSwapHandler<>(super::hashCode);
    public MethodHandler<SetAgeDoubleHandler> setAgeDoubleHandler = new MethodHotSwapHandler<>(super::setAge);
    public MethodHandler<SetAgeIntHandler> setAgeIntHandler = new MethodHotSwapHandler<>(super::setAge);
    public MethodHandler<SetGenericNavigableMapHandler<T>> setGenericNavigableMapHandler = new MethodHotSwapHandler<>(super::setGeneric);
    public MethodHandler<SetMixedGenericsNumberNavigableMapHandler<T>> setMixedGenericsNumberNavigableMapHandler = new MethodHotSwapHandler<>(super::setMixedGenerics);
    public MethodHandler<SetNameStringHandler> setNameStringHandler = new MethodHotSwapHandler<>(super::setName);
    public MethodHandler<ToStringHandler> toStringHandler = new MethodHotSwapHandler<>(super::toString);
    public MethodHandler<VarArgGenericExampleObjectHandler> varArgGenericExampleObjectHandler = new MethodHotSwapHandler<>(super::varArgGenericExample);
    public MethodHandler<VarArgsExampleStringHandler> varArgsExampleStringHandler = new MethodHotSwapHandler<>(super::varArgsExample);
    public ExampleClassWrapper(java.lang.String arg0, int arg1, T arg2) {
        super(arg0, arg1, arg2);
    }

    public ExampleClassWrapper(java.lang.String arg0, int arg1) {
        super(arg0, arg1);
    }

    @Override
    public int hashCode() {
        return (this.hashCodeHandler != null && this.hashCodeHandler.getHandler() != null) ? this.hashCodeHandler.getHandler().onHashCode() : super.hashCode();
    }

    @Override
    public java.lang.String toString() {
        return (this.toStringHandler != null && this.toStringHandler.getHandler() != null) ? this.toStringHandler.getHandler().onToString() : super.toString();
    }
    @Override
    public boolean equals(java.lang.Object arg0) {
        return (this.equalsObjectHandler != null && this.equalsObjectHandler.getHandler() != null) ? this.equalsObjectHandler.getHandler().onEquals(arg0) : super.equals(arg0);
    }

    @Override
    public void setGeneric(T arg0) {
        if (this.setGenericNavigableMapHandler != null && this.setGenericNavigableMapHandler.getHandler() != null) {
            this.setGenericNavigableMapHandler.getHandler().onSetGeneric(arg0);
        } else {
            super.setGeneric(arg0);
        }
    }

    @Override
    public void setName(java.lang.String arg0) {
        if (this.setNameStringHandler != null && this.setNameStringHandler.getHandler() != null) {
            this.setNameStringHandler.getHandler().onSetName(arg0);
        } else {
            super.setName(arg0);
        }
    }
    @Override
    public T getGeneric() {
        return (this.getGenericHandler != null && this.getGenericHandler.getHandler() != null) ? this.getGenericHandler.getHandler().onGetGeneric() : super.getGeneric();
    }
    @Override
    public java.lang.String getName() {
        return (this.getNameHandler != null && this.getNameHandler.getHandler() != null) ? this.getNameHandler.getHandler().onGetName() : super.getName();
    }

    @Override
    public int getAge() {
        return (this.getAgeHandler != null && this.getAgeHandler.getHandler() != null) ? this.getAgeHandler.getHandler().onGetAge() : super.getAge();
    }

    @Override
    public <G> void calculateGeneric(G arg0) {
        if (this.calculateGenericObjectHandler != null && this.calculateGenericObjectHandler.getHandler() != null) {
            this.calculateGenericObjectHandler.getHandler().onCalculateGeneric(arg0);
        } else {
            super.calculateGeneric(arg0);
        }
    }
    @Override
    public void setAge(int arg0) {
        if (this.setAgeIntHandler != null && this.setAgeIntHandler.getHandler() != null) {
            this.setAgeIntHandler.getHandler().onSetAge(arg0);
        } else {
            super.setAge(arg0);
        }
    }
    @Override
    public void setAge(double arg0) {
        if (this.setAgeDoubleHandler != null && this.setAgeDoubleHandler.getHandler() != null) {
            this.setAgeDoubleHandler.getHandler().onSetAge(arg0);
        } else {
            super.setAge(arg0);
        }
    }

    @Override
    public void varArgsExample(java.lang.String... arg0) {
        if (this.varArgsExampleStringHandler != null && this.varArgsExampleStringHandler.getHandler() != null) {
            this.varArgsExampleStringHandler.getHandler().onVarArgsExample(arg0);
        } else {
            super.varArgsExample(arg0);
        }
    }

    @Override
    public <COMPLEX_GENERIC extends java.lang.Number> void setMixedGenerics(COMPLEX_GENERIC arg0, T arg1) {
        if (this.setMixedGenericsNumberNavigableMapHandler != null && this.setMixedGenericsNumberNavigableMapHandler.getHandler() != null) {
            this.setMixedGenericsNumberNavigableMapHandler.getHandler().onSetMixedGenerics(arg0, arg1);
        } else {
            super.setMixedGenerics(arg0, arg1);
        }
    }

    @Override
    public <COMPLEX_GENERIC extends java.lang.Number> void complexGenericExample(COMPLEX_GENERIC arg0) {
        if (this.complexGenericExampleNumberHandler != null && this.complexGenericExampleNumberHandler.getHandler() != null) {
            this.complexGenericExampleNumberHandler.getHandler().onComplexGenericExample(arg0);
        } else {
            super.complexGenericExample(arg0);
        }
    }

    @Override
    public <COMPLEX_GENERIC extends java.lang.Number> COMPLEX_GENERIC getComplexGeneric() {
        return (this.getComplexGenericHandler != null && this.getComplexGenericHandler.getHandler() != null) ? this.getComplexGenericHandler.getHandler().onGetComplexGeneric() : super.getComplexGeneric();
    }
    @Override
    public <T> T varArgGenericExample(T... arg0) {
        return (this.varArgGenericExampleObjectHandler != null && this.varArgGenericExampleObjectHandler.getHandler() != null) ? this.varArgGenericExampleObjectHandler.getHandler().onVarArgGenericExample(arg0) : super.varArgGenericExample(arg0);
    }

    @Override
    public <L, M, N extends T> L getPITAGeneric(T arg0, L arg1) {
        return (this.getPITAGenericNavigableMapObjectHandler != null && this.getPITAGenericNavigableMapObjectHandler.getHandler() != null) ? this.getPITAGenericNavigableMapObjectHandler.getHandler().onGetPITAGeneric(arg0, arg1) : super.getPITAGeneric(arg0, arg1);
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
