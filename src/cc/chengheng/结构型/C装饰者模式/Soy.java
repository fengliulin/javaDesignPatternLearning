package cc.chengheng.结构型.C装饰者模式;

/**
 * 豆浆味道
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆味道");
        setPrice(1.5f);
    }
}
