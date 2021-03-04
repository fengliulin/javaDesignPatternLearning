package cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order.Impl;

import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order.Factory;
import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza.*;

public class LDFactoryImpl implements Factory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
