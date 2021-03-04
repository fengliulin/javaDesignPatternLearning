package cc.chengheng.创建型.B工厂设计模式.A简单工厂模式.使用.order;

// 相当于客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {

        // 使用简单工厂
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
