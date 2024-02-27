package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;
public class ExampleClassWrapper<T> extends pie.ilikepiefoo.wrappergen.example.ExampleClass<T> {
    public final MethodOverrideHandler<CalculateGenericObjectHandler> calculateGenericObjectHandler;
    public final MethodOverrideHandler<EqualsObjectHandler> equalsObjectHandler;
    public final MethodOverrideHandler<GetAgeHandler> getAgeHandler;
    public final MethodOverrideHandler<GetGenericHandler<T>> getGenericHandler;
    public final MethodOverrideHandler<GetNameHandler> getNameHandler;
    public final MethodOverrideHandler<HashCodeHandler> hashCodeHandler;
    public final MethodOverrideHandler<SetAgedoubleHandler> setAgedoubleHandler;
    public final MethodOverrideHandler<SetAgeintHandler> setAgeintHandler;
    public final MethodOverrideHandler<SetGenericObjectHandler<T>> setGenericObjectHandler;
    public final MethodOverrideHandler<SetNameStringHandler> setNameStringHandler;
    public final MethodOverrideHandler<ToStringHandler> toStringHandler;
    public final MethodOverrideHandler<VarArgGenericExampleObjectHandler> varArgGenericExampleObjectHandler;
    public final MethodOverrideHandler<VarArgsExampleStringHandler> varArgsExampleStringHandler;
    public ExampleClassWrapper(java.lang.String arg0, int arg1) {
        super(arg0, arg1);
        this.getNameHandler = new MethodOverrideHandler<>(super::getName);
        this.setNameStringHandler = new MethodOverrideHandler<>(super::setName);
        this.varArgGenericExampleObjectHandler = new MethodOverrideHandler<>(super::varArgGenericExample);
        this.calculateGenericObjectHandler = new MethodOverrideHandler<>(super::calculateGeneric);
        this.getAgeHandler = new MethodOverrideHandler<>(super::getAge);
        this.getGenericHandler = new MethodOverrideHandler<>(super::getGeneric);
        this.setAgedoubleHandler = new MethodOverrideHandler<>(super::setAge);
        this.setAgeintHandler = new MethodOverrideHandler<>(super::setAge);
        this.setGenericObjectHandler = new MethodOverrideHandler<>(super::setGeneric);
        this.varArgsExampleStringHandler = new MethodOverrideHandler<>(super::varArgsExample);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
    }

    public ExampleClassWrapper(java.lang.String arg0, int arg1, T arg2) {
        super(arg0, arg1, arg2);
        this.getNameHandler = new MethodOverrideHandler<>(super::getName);
        this.setNameStringHandler = new MethodOverrideHandler<>(super::setName);
        this.varArgGenericExampleObjectHandler = new MethodOverrideHandler<>(super::varArgGenericExample);
        this.calculateGenericObjectHandler = new MethodOverrideHandler<>(super::calculateGeneric);
        this.getAgeHandler = new MethodOverrideHandler<>(super::getAge);
        this.getGenericHandler = new MethodOverrideHandler<>(super::getGeneric);
        this.setAgedoubleHandler = new MethodOverrideHandler<>(super::setAge);
        this.setAgeintHandler = new MethodOverrideHandler<>(super::setAge);
        this.setGenericObjectHandler = new MethodOverrideHandler<>(super::setGeneric);
        this.varArgsExampleStringHandler = new MethodOverrideHandler<>(super::varArgsExample);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
    }

    @FunctionalInterface
    public interface CalculateGenericObjectHandler {
        <G> void onCalculateGeneric( G arg0 );
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
    public interface GetGenericHandler<T> {
        T onGetGeneric();
    }

    @FunctionalInterface
    public interface GetNameHandler {
        java.lang.String onGetName();
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
    public interface SetGenericObjectHandler<T> {
        void onSetGeneric( T arg0 );
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