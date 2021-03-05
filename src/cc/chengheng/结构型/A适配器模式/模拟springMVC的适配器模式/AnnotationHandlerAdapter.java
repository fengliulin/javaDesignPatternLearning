package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

public class AnnotationHandlerAdapter implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }

    @Override
    public boolean supports(Object handler) {
        return handler instanceof AnnotationController;
    }
}
