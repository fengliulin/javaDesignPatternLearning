package cc.chengheng.结构型.C装饰者模式;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
