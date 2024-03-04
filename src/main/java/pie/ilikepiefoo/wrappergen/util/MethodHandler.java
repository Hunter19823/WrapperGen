package pie.ilikepiefoo.wrappergen.util;

public interface MethodHandler<HANDLER> {
    HANDLER getHandler();

    HANDLER getSuperHandler();

    void setHandler(HANDLER handler);
}
