package cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.使用.pizza;

/**
 * 希腊披萨
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
