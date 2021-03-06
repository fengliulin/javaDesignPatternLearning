package cc.chengheng.结构型.C装饰者模式;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶味道");
        setPrice(2.0f);
    }
}
