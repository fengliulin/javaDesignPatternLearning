package cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.不使用.pizza;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
