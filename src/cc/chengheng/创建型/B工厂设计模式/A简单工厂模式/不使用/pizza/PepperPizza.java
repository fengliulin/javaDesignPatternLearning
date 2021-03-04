package cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.不使用.pizza;

/**
 * 胡椒披萨
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
