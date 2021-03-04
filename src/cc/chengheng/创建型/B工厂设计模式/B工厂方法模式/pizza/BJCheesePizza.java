package cc.chengheng.创建型.B工厂设计模式.B工厂方法模式.pizza;

/**
 * 北京奶酪披萨
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨----给制作奶酪披萨准备原材料");
    }
}
