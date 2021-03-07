package cc.chengheng.行为型.B命令模式;

/**
 * 电灯接收命令
 */
public class LightReceiver {

    public void on() {
        System.out.println("电灯打开了...");
    }

    public void off() {
        System.out.println("电灯关闭了...");
    }
}
