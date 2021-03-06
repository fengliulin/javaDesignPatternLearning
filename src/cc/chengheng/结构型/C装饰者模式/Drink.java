package cc.chengheng.结构型.C装饰者模式;

/**
 * 饮品
 */
public abstract class Drink {

    /** 描述 */
    public String des;

    private float price = 0.0f;

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /** 计算费用的抽象方法 */
    public abstract float cost();

    public String getDes() {
        return des;
    }
}
