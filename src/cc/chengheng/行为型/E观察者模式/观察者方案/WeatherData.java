package cc.chengheng.行为型.E观察者模式.观察者方案;

import cc.chengheng.行为型.E观察者模式.普通方案.CurrentConditions;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类 - 天气数据
 *  1、包含最新的天气情况信息
 *  2、含有观察者集合,使用ArrayList管理
 *  3、当数据由更新时，就主动调用ArrayList,通知所有的（接入方）就看到了最新的信息
 */
public class WeatherData implements Subject {

    /** 温度 */
    private float temperature;

    /** 压力 */
    private float pressure;

    /** 湿度 */
    private float humidity;

    /** 接入方：观察者的集合 */
    private final List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    //region 属性不提供给别的类用，不需要添加这几个方法
    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
    //endregion

    public void dataChange() {

        // 调用接入方的update
        //currentConditions.update(getTemperature(), getPressure(), getHumidity());
        notifyObservers();
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

    /**
     * 注册一个观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除一个观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 遍历所有的观察者，并通知
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temperature, pressure, humidity);
        }
    }
}
