package pie.ilikepiefoo.wrappergen.util;

import pie.ilikepiefoo.wrappergen.builder.ClassBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;

import java.lang.reflect.Method;

public class GenerationUtils {

    public static ClassBuilder createMethodHandler( Method method, int indentLevel ) {
        ClassBuilder classBuilder = new ClassBuilder();
        // CamelCase the method name and add Handler to the end.
        classBuilder.setImports("");
        classBuilder.setName(method.getName().substring(0, 1).toUpperCase() +
            method.getName().substring(1) +
            "Handler");
        classBuilder.addAnnotations("@FunctionalInterface");
        classBuilder.setAccessModifier("public");
        classBuilder.setStructureType("interface");

        // Add the method to the interface.
        MethodBuilder methodBuilder = new MethodBuilder().setName(method.getName())
            .setReturnType(method.getReturnType().getSimpleName())
            .setAccessModifier("public")
            .setIncludeMethodBody(false);

        //        classBuilder.addBody(method.toGenericString());
        for (var generic : method.getTypeParameters()) {
            methodBuilder.addArg(generic.toString());
        }
        for (var parameters : method.getParameters()) {
            methodBuilder.addArg(parameters.getParameterizedType().getTypeName() +
                " " +
                parameters.getName());
        }
        classBuilder.addBody(methodBuilder.toJavaFile(1));
        return classBuilder;
    }

}
