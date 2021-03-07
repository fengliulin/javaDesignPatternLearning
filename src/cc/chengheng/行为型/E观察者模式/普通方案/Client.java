package cc.chengheng.行为型.E观察者模式.普通方案;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();

        // currentConditions接入方传递到WeatherData
        WeatherData weatherData = new WeatherData(currentConditions);

        // 更新天气情况
        weatherData.setData(30, 150, 40);

        // 天气情况变化
        System.out.println("================天气情况变化======================");
        weatherData.setData(40, 160, 20);
    }
}
