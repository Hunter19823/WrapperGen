package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;
import pie.ilikepiefoo.wrappergen.example.ChildClass;
import pie.ilikepiefoo.wrappergen.example.ExampleClass;
import pie.ilikepiefoo.wrappergen.example.ParentClass;
import pie.ilikepiefoo.wrappergen.example.PerfectlyNormalExampleClass;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        generateWrapperClass(TreeMap.class, "pie.ilikepiefoo.wrappergen.example", "TreeMapWrapper");
        generateWrapperClass(PerfectlyNormalExampleClass.class, "pie.ilikepiefoo.wrappergen.example", "PerfectlyNormalExampleClassWrapper");
        generateWrapperClass(ExampleClass.class, "pie.ilikepiefoo.wrappergen.example", "ExampleClassWrapper");
        generateWrapperClass(ArrayList.class, "pie.ilikepiefoo.wrappergen.example", "CustomWrapper");
        generateWrapperClass(ChildClass.class, "pie.ilikepiefoo.wrappergen.example", "ChildClassWrapper");
        generateWrapperClass(ParentClass.class, "pie.ilikepiefoo.wrappergen.example", "ParentClassWrapper");
//        TreeMapWrapper<String, String> treeMapWrapper = new TreeMapWrapper<>();
//        treeMapWrapper.put("Hello", "World");
//        System.out.println(treeMapWrapper.get("Hello"));
//
//        treeMapWrapper.putObjectObjectHandler.setCustomHandler(
//            (key, value) -> {
//                System.out.println("An item with key: " + key + " and value: " + value + " was added to the TreeMap.");
//                return treeMapWrapper.putObjectObjectHandler.getSuperHandler().onPut(key, value);
//            }
//        );
//
//        treeMapWrapper.put("Hello", "Earth");
//        System.out.println(treeMapWrapper.get("Hello"));
    }

    public static void generateWrapperClass(Class<?> subject, String packageName, String className) {
        WrapperClassBuilder builder = new WrapperClassBuilder(className);
        builder.setPackageName(packageName);
        builder.addClassImplementation(subject);
//        System.out.println(builder.toJavaFile(0));
        File file = new File("src/main/java/" + packageName.replace(".", "/") + "/" + className + ".java");
        try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
            writer.write(builder.toJavaFile(0));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}