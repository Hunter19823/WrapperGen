package pie.ilikepiefoo.wrappergen.presets;

import pie.ilikepiefoo.wrappergen.builder.FieldBuilder;
import pie.ilikepiefoo.wrappergen.builder.MethodBuilder;
import pie.ilikepiefoo.wrappergen.builder.WrapperClassBuilder;

import java.util.ArrayList;
import java.util.List;

public class BuilderClassBuilder extends WrapperClassBuilder {
    protected final List<FieldBuilder> builderFields;
    protected final List<MethodBuilder> getterMethods;
    protected final List<MethodBuilder> methodOverrides;

    public BuilderClassBuilder(String name) {
        super(name);
        this.builderFields = new ArrayList<>();
        this.getterMethods = new ArrayList<>();
        this.methodOverrides = new ArrayList<>();
    }

    public BuilderClassBuilder addMethodWrapper(MethodWrapper methodWrapper) {
        if (this.innerClassBuilders.containsKey(methodWrapper.getWrapperType().getName())) {
            throw new IllegalArgumentException("Inner class already exists with name " +
                methodWrapper.getWrapperType().getName() +
                " already exists.");
        }
        this.addField(
            methodWrapper
                .getField()
                .setType(methodWrapper
                    .getWrapperType()
                    .getCanonicalName()
                )
        );
//        this.addMethod(methodWrapper.getOverrideMethod());

        this.addInnerClass(methodWrapper.getWrapperType());
        this.importBuilder.addImports(methodWrapper.getRequiredImports());

        return this;
    }
}
