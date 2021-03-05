package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

public interface HandlerAdapter {
    void handle(Object handler);

    /**
     * 适配器模式就是一个转换或看看是不是同一个类型，如果是，这里面的方法就可以用
     * @param handler
     * @return
     */
    boolean supports(Object handler);
}
