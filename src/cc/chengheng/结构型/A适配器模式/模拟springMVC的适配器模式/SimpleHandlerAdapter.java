package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

public class SimpleHandlerAdapter implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }
}
