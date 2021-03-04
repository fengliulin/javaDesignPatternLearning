package cc.chengheng.创建型.B工厂设计模式.B工厂方法模式.order;

import cc.chengheng.创建型.B工厂设计模式.B工厂方法模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购披萨
 */
public abstract class AbstractOrderPizza {

    // 定义一个抽象方法，让各工厂类自己实现
    abstract Pizza createPizza(String orderType);

    // 构造器
    public AbstractOrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 回掉，工厂子类实现的方法

            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
