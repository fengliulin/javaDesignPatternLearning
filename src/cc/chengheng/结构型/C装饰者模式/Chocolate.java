package cc.chengheng.结构型.C装饰者模式;

/**
 * 具体的Chocolate  调味品，巧克力味
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力味道");
        setPrice(3.0f); // 调味品的价格
    }
}
