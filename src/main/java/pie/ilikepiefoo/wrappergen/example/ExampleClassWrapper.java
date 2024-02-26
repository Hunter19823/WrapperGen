package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;

public class ExampleClassWrapper extends ExampleClass {
    public final MethodOverrideHandler<GetAgeHandler> getAgeHandler;
    public final MethodOverrideHandler<GetNameHandler> getNameHandler;
    public final MethodOverrideHandler<SetAgeHandler> setAgeHandler;
    public final MethodOverrideHandler<SetNameHandler> setNameHandler;
    public final MethodOverrideHandler<SetAgeDoubleHandler> setAgeDoubleHandler;

    public ExampleClassWrapper( String name, int age ) {
        super(name, age);
        this.getAgeHandler = new MethodOverrideHandler<>(super::getAge);
        this.getNameHandler = new MethodOverrideHandler<>(super::getName);
        this.setAgeHandler = new MethodOverrideHandler<>(super::setAge);
        this.setNameHandler = new MethodOverrideHandler<>(super::setName);
        this.setAgeDoubleHandler = new MethodOverrideHandler<>(super::setAge);
    }

    @Override
    public String getName() {
        return getNameHandler.getHandler().getName();
    }

    @Override
    public void setName( String name ) {
        setNameHandler.getHandler().setName(name);
    }

    @Override
    public int getAge() {
        return getAgeHandler.getHandler().getAge();
    }

    @Override
    public void setAge( int age ) {
        setAgeHandler.getHandler().setAge(age);
    }

    @Override
    public void setAge( double age ) {
        setAgeDoubleHandler.getHandler().setAge(age);
    }

    public interface GetNameHandler {
        String getName();

    }

    public interface GetAgeHandler {
        int getAge();

    }

    public interface SetNameHandler {
        void setName( String name );

    }

    public interface SetAgeHandler {
        void setAge( int age );

    }

    public interface SetAgeDoubleHandler {
        void setAge( double age );

    }

}
