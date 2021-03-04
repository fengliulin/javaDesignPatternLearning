package cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order.Impl;

import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order.Factory;
import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza.BJCheesePizza;
import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza.BJPepperPizza;
import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza.Pizza;

// 这是一个工厂子类
public class BJFactoryImpl implements Factory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
