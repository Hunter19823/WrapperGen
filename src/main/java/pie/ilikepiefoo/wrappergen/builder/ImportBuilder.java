package pie.ilikepiefoo.wrappergen.builder;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class ImportBuilder implements JavaFileOutput {
    private String packageName;
    private final TreeSet<String> imports;

    public ImportBuilder() {
        this.packageName = this.getClass().getPackageName();
        this.imports = new TreeSet<>();
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

    public ImportBuilder addImports( Collection<String> importNames ) {
        this.imports.addAll(importNames);
        return this;
    }

    public String getPackageName() {
        return packageName;
    }

    public TreeSet<String> getImports() {
        return imports;
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
