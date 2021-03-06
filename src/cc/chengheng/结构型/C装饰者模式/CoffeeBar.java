package cc.chengheng.结构型.C装饰者模式;

public class CoffeeBar {
    public static void main(String[] args) {
        // 装饰者模式下订单：2份巧克力味 + 一份牛奶味的 LongBlack(美式咖啡)

        // 点一份
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());

        // order加入一份牛奶味
        order = new Milk(order);
        System.out.println("order 加入一份牛奶 费用=" + order.cost());
        System.out.println("order 加入一份牛奶 描述=" + order.getDes());

        // order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶  加入一份巧克力 费用=" + order.cost());
        System.out.println("order 加入一份牛奶  加入一份巧克力 描述=" + order.getDes());

        // order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶  加入一份巧克力 加入一份巧克力 费用=" + order.cost());
        System.out.println("order 加入一份牛奶  加入一份巧克力 加入一份巧克力 描述=" + order.getDes());
    }
}
