package cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order;

import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.order.Impl.BJFactoryImpl;
import cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    private Factory factory;

    public OrderPizza(Factory factory) {
        this.factory = factory;
        setFactory(this.factory);
    }

    private void setFactory(Factory factory) {
        Pizza pizza = null;
        String orderType = ""; // 用户输入
        this.factory = factory;

        do {
            orderType = getType();

            // factory 可能是北京的工厂实现类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败！！！");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入您要订购的披萨类型：");
        String str = null;
        try {
            str = strIn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
