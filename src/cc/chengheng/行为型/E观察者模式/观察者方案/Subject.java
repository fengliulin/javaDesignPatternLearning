package cc.chengheng.行为型.E观察者模式.观察者方案;

/**
 * 接口，让WeatherData 来实现
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
