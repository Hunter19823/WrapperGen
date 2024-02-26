package pie.ilikepiefoo.wrappergen.example;

public class ExampleClass {

    private String name;
    private int age;

    public ExampleClass( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public void setAge( double age ) {
        this.age = (int) age;
    }

}
