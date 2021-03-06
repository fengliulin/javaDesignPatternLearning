package cc.chengheng.结构型.B桥接模式;

public class UpRightPhone extends AbstractPhone {
    /**
     * 构造手机品牌
     *
     * @param brand
     */
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
