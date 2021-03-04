package cc.chengheng.创建型.B工厂设计模式.B工厂方法模式.pizza;

/**
 * 伦敦奶酪披萨
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨----给制作奶酪披萨准备原材料");
    }
}
