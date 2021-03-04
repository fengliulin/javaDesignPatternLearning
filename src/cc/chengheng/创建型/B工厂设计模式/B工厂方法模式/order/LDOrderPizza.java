package cc.chengheng.创建型.B工厂设计模式.B工厂方法模式.order;

import cc.chengheng.创建型.B工厂设计模式.B工厂方法模式.pizza.*;

public class LDOrderPizza extends AbstractOrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
