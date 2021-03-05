package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

public class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }

    @Override
    public boolean supports(Object handler) {
        return handler instanceof HttpController;
    }
}
