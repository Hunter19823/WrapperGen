package pie.ilikepiefoo.wrappergen.util;

public class MethodOverrideHandler<HANDLER> {
    private HANDLER superHandler;
    private HANDLER customHandler;

    public MethodOverrideHandler() {

    }

    public MethodOverrideHandler(HANDLER superHandler) {
        this.superHandler = superHandler;
    }

    public MethodOverrideHandler(HANDLER superHandler, HANDLER customHandler) {
        this.superHandler = superHandler;
        this.customHandler = customHandler;
    }

    public MethodOverrideHandler<HANDLER> setCustomHandler(HANDLER customHandler) {
        this.customHandler = customHandler;
        return this;
    }

    public HANDLER getHandler() {
        if (superHandler == null && customHandler == null) {
            throw new IllegalStateException("Not implemented.");
        }
        return customHandler != null
            ? customHandler
            : superHandler;
    }

    public HANDLER getSuperHandler() {
        return superHandler;
    }

    public MethodOverrideHandler<HANDLER> setSuperHandler(HANDLER superHandler) {
        this.superHandler = superHandler;
        return this;
    }

}
