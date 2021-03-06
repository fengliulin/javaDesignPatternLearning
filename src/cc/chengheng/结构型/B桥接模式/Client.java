package cc.chengheng.结构型.B桥接模式;

public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机（样式 + 品牌）

        AbstractPhone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("==================================");

        AbstractPhone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("==================================");

        AbstractPhone phone3 = new UpRightPhone(new Vivo());
        phone3.open();
        phone3.call();
        phone3.close();
    }
}
