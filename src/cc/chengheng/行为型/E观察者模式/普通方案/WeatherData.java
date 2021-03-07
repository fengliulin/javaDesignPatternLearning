package cc.chengheng.行为型.E观察者模式.普通方案;

/**
 * 核心类 - 天气数据
 *  1、包含最新的天气情况信息
 *  2、含有CurrentConditions对象
 *  3、当数据由更新时，就主动调用CurrentConditions对象的update方法（含display）,这样他们（接入方）就看到了最新的信息
 */
public class WeatherData {

    /** 温度 */
    private float temperature;

    /** 压力 */
    private float pressure;

    /** 湿度 */
    private float humidity;

    /** 接入方 */
    private final CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {

        // 调用接入方的update
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    /**
     * 当数据有更新时，就调用setData
     * @param temperature   温度
     * @param pressure      压力
     * @param humidity      湿度
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        // 将最新的信息推送给接入方
        dataChange();
    }
}
