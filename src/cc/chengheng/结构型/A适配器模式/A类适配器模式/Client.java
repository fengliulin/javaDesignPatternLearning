package cc.chengheng.结构型.A适配器模式.A类适配器模式;

public class Client {
    public static void main(String[] args) {
        System.out.println("========类适配器模式=======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
