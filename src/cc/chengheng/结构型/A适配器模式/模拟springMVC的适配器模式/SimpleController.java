package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

public class SimpleController implements Controller {
    public void doSimpleHandler() {
        System.out.println("Simple.....");
    }
}
