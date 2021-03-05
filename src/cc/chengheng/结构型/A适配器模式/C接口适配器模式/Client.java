package cc.chengheng.结构型.A适配器模式.C接口适配器模式;

public class Client {
    public static void main(String[] args) {
        new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        }.m1();
    }
}
