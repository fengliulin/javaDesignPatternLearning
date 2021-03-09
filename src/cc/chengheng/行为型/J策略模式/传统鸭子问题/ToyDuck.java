package cc.chengheng.行为型.J策略模式.传统鸭子问题;

/**
 * 玩具鸭
 */
public class ToyDuck extends AbstractDuck {
    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    // 需要重写父类的所有方法
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

    public void fly() {
        System.out.println("玩具鸭不会飞翔");
    }
}
