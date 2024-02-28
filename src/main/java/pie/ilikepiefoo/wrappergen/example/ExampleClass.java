package pie.ilikepiefoo.wrappergen.example;

import java.util.List;
import java.util.NavigableMap;
import java.util.Set;

public class ExampleClass<T extends NavigableMap<String, List<Set<T>>>, G extends T, F extends H, H extends List<F>> {

    private String name;
    private int age;
    private T generic;

    public ExampleClass(String name, int age) {
        this.name = name;
        this.age = age;
        this.generic = null;
    }

    public ExampleClass(String name, int age, T generic) {
        this.name = name;
        this.age = age;
        this.generic = generic;
    }

    public T getGeneric() {
        return generic;
    }

    public void setGeneric(T generic) {
        this.generic = generic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(double age) {
        this.age = (int) age;
    }

    public <G> void calculateGeneric(G genericValue) {
        System.out.println("Generic value: " + genericValue);
    }

    public void varArgsExample(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public <T> T varArgGenericExample(T... args) {
        return args[0];
    }

    public <COMPLEX_GENERIC extends Number> void complexGenericExample(COMPLEX_GENERIC generic) {
        System.out.println("Generic value: " + generic);
    }

    public <COMPLEX_GENERIC extends Number> COMPLEX_GENERIC getComplexGeneric() {
        return null;
    }

    public <COMPLEX_GENERIC extends Number> void setMixedGenerics(COMPLEX_GENERIC generic, T generic2) {
        System.out.println("Generic value: " + generic);
    }

    public <L, M, N extends T> L getPITAGeneric(T tGeneric, L lGeneric) {
        return null;
    }
}
