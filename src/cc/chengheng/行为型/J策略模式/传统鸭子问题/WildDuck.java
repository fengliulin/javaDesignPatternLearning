package cc.chengheng.行为型.J策略模式.传统鸭子问题;

/**
 * 野鸭
 */
public class WildDuck extends AbstractDuck {
    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
