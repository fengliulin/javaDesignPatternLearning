package cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.使用.order;

import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.使用.pizza.CheesePizza;
import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.使用.pizza.GreekPizza;
import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.使用.pizza.PepperPizza;
import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.使用.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    // 根据orderType，返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if(orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
