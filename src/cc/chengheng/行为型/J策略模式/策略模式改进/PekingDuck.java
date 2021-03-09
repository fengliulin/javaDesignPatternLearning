package cc.chengheng.行为型.J策略模式.策略模式改进;

/**
 * 北京鸭
 */
public class PekingDuck extends AbstractDuck {

    /**
     * 不会飞
     */
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
