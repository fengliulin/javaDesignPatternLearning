package cc.chengheng.行为型.E观察者模式.观察者方案;

public class CurrentConditions implements Observer {

    /** 温度 */
    private float temperature;

    /** 压力 */
    private float pressure;

    /** 湿度 */
    private float humidity;

    /**
     * 更新天气情况，是由WeatherData来调用，我使用推送模式
     * @param temperature   温度
     * @param pressure      压力
     * @param humidity      湿度
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("今天温度：" + temperature);
        System.out.println("今天压力：" + pressure);
        System.out.println("今天湿度：" + humidity);
    }
}
