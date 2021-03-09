package cc.chengheng.行为型.J策略模式.策略模式改进;

/**
 * 野鸭
 */
public class WildDuck extends AbstractDuck {

    /**
     * 构造器, 传入FlyBehavior对象
     */
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
