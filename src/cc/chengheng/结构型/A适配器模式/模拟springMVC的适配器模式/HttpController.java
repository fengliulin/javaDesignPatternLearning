package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

public class HttpController implements Controller {
    public void doHttpHandler() {
        System.out.println("http.....");
    }
}
