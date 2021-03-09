package cc.chengheng.行为型.J策略模式.传统鸭子问题;

public abstract class AbstractDuck {

    public AbstractDuck() {
    }

    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void fly() {
        System.out.println("鸭子会飞翔");
    }
}
