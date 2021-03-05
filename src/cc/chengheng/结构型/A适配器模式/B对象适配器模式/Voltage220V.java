package cc.chengheng.结构型.A适配器模式.B对象适配器模式;

/** 被适配器类 */
public class Voltage220V {

    /** 输出220v电压 */
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "v");
        return src;
    }
}