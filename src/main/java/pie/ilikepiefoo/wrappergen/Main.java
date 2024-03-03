package pie.ilikepiefoo.wrappergen;

import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;
import pie.ilikepiefoo.wrappergen.example.TreeMapWrapper;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        generateWrapperClass(TreeMap.class, "pie.ilikepiefoo.wrappergen.example", "TreeMapWrapper");
        TreeMapWrapper<String, String> treeMapWrapper = new TreeMapWrapper<>();
        treeMapWrapper.put("Hello", "World");
        System.out.println(treeMapWrapper.get("Hello"));

        treeMapWrapper.putObjectObjectHandler.setCustomHandler(
            (key, value) -> {
                System.out.println("An item with key: " + key + " and value: " + value + " was added to the TreeMap.");
                return treeMapWrapper.putObjectObjectHandler.getSuperHandler().onPut(key, value);
            }
        );

        treeMapWrapper.put("Hello", "Earth");
        System.out.println(treeMapWrapper.get("Hello"));
    }

    public static void generateWrapperClass(Class<?> subject, String packageName, String className) {
        WrapperClassBuilder builder = new WrapperClassBuilder(className);
        builder.setPackageName(packageName);
        builder.addClassImplementation(subject);
        File file = new File("src/main/java/" + packageName.replace(".", "/") + "/" + className + ".java");
        try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
            writer.write(builder.toJavaFile(0));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}