package pie.ilikepiefoo.wrappergen.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImportBuilder implements JavaFileOutput {
    private String packageName;
    private final List<String> imports;

    public ImportBuilder() {
        this.packageName = this.getClass().getPackageName();
        this.imports = new ArrayList<>();
    }

    public ImportBuilder setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public ImportBuilder addImport(String importName) {
        this.imports.add(importName);
        return this;
    }

    public ImportBuilder addImports(String[] importNames) {
        this.imports.addAll(Arrays.asList(importNames));
        return this;
    }


    @Override
    public String toJavaFile( int indentLevel ) {
        StringBuilder sb = new StringBuilder();
        if (!this.packageName.isBlank()) {
            sb.append("package ").append(this.packageName).append(";\n\n");
        }
        for(String className : this.imports)
        {
            sb.append("import ").append(className).append(";\n");
        }
        return sb.toString();
    }

}
