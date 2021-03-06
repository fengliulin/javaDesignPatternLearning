package cc.chengheng.结构型.C装饰者模式;

/**
 * Decorator 装饰者
 */
public class Decorator extends Drink {

    private final Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // obj.cost() 这里对象包对象，调用递归， 结束条件是：找到最里面的Coffee，获取价格返回，和当前对象的价格+在一起
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getPrice() 输出被装饰者的信息
        return super.getDes() + " " + super.getPrice() + " && " + obj.getPrice();
    }
}
