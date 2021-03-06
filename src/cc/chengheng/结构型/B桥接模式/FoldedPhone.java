package cc.chengheng.结构型.B桥接模式;

/**
 * 折叠式手机，继承了 抽象类 AbstractPhone
 */
public class FoldedPhone extends AbstractPhone {

    /**
     * 构造手机品牌
     */
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
