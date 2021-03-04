package cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order;

import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza.Pizza;

// 一个抽象工厂模式的抽象层(接口)
public interface Factory {
    Pizza createPizza(String orderType);
}
