package cc.chengheng.结构型.B桥接模式;

public abstract class AbstractPhone {

    private Brand brand; // 组合品牌

    /** 构造手机品牌 */
    public AbstractPhone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
