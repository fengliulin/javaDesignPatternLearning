package cc.chengheng.行为型.J策略模式.传统鸭子问题;

/**
 * 北京鸭
 */
public class PekingDuck extends AbstractDuck {
    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    /**
     * 北京鸭不能飞翔，需要重写fly
     */
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
