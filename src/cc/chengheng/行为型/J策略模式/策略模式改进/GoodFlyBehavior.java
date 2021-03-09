package cc.chengheng.行为型.J策略模式.策略模式改进;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
