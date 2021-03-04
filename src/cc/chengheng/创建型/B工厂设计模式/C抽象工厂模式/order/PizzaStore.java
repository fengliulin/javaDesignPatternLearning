package cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order;

import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order.Impl.BJFactoryImpl;
import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order.Impl.LDFactoryImpl;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new BJFactoryImpl());
        new OrderPizza(new LDFactoryImpl());
    }
}
