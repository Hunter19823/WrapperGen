package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;
import pie.ilikepiefoo.wrappergen.example.ChildClass;
import pie.ilikepiefoo.wrappergen.example.ExampleClass;
import pie.ilikepiefoo.wrappergen.example.ParentClass;
import pie.ilikepiefoo.wrappergen.example.PerfectlyNormalExampleClass;
import pie.ilikepiefoo.wrappergen.presets.BuilderClassBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Class<?>, String> classMap = new HashMap<>();
        String examplePackage = "pie.ilikepiefoo.wrappergen.example";
        classMap.put(TreeMap.class, examplePackage);
        classMap.put(PerfectlyNormalExampleClass.class, examplePackage);
        classMap.put(ExampleClass.class, examplePackage);
        classMap.put(ArrayList.class, examplePackage);
        classMap.put(ChildClass.class, examplePackage);
        classMap.put(ParentClass.class, examplePackage);
        for (Map.Entry<Class<?>, String> entry : classMap.entrySet()) {
            generateWrapperClass(entry.getKey(), entry.getValue());
            generateBuilderClass(entry.getKey(), entry.getValue());
        }
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

    public static void generateWrapperClass(Class<?> subject, String packageName) {
        WrapperClassBuilder builder = new WrapperClassBuilder(subject.getSimpleName() + "Wrapper");
        builder.setPackageName(packageName);
        builder.addClassImplementation(subject);
//        System.out.println(builder.toJavaFile(0));
        File file = new File("src/main/java/" + packageName.replace(".", "/") + "/" + subject.getSimpleName() + "Wrapper" + ".java");
        try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
            writer.write(builder.toJavaFile(0));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static void generateBuilderClass(Class<?> subject, String packageName) {
        WrapperClassBuilder builder = new BuilderClassBuilder(subject.getSimpleName() + "Builder");
        builder.setPackageName(packageName);
        builder.addClassImplementation(subject);
//        System.out.println(builder.toJavaFile(0));
        File file = new File("src/main/java/" + packageName.replace(".", "/") + "/" + subject.getSimpleName() + "Builder" + ".java");
        try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
            writer.write(builder.toJavaFile(0));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}