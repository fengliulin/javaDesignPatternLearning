package cc.chengheng.结构型.A适配器模式.B对象适配器模式;

public class Phone {

    // 充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5v，可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5v，不能充电");
        }
    }
}
