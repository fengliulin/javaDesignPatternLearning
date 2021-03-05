package cc.chengheng.结构型.A适配器模式.A类适配器模式;

/** 适配器类 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
