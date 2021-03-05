package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

public class AnnotationController implements Controller {
    public void doAnnotationHandler() {
        System.out.println("Annotation.....");
    }
}
