package cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza;

/**
 * 北京胡椒披萨
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨----给制作奶酪披萨准备原材料");
    }
}
