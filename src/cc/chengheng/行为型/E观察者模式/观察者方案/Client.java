package cc.chengheng.行为型.E观察者模式.观察者方案;

public class Client {
    public static void main(String[] args) {
        // 创建一个WeatherDate
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();

        // 注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(new BaiduSite());

        // 测试
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10, 100, 33);
    }
}
