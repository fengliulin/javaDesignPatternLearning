package cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.不使用.order;

import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.不使用.pizza.CheesePizza;
import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.不使用.pizza.GreekPizza;
import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.不使用.pizza.PepperPizza;
import cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.不使用.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购披萨
 */
public class OrderPizza {

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if(orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if(orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cur();
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
