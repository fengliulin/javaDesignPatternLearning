package cc.chengheng.行为型.J策略模式.策略模式改进;


public abstract class AbstractDuck {

    //属性，策略接口
    FlyBehavior flyBehavior;
    // 其它属性<->策略接口

    QuackBehavior quackBehavior;

    /**
     * 动态改变叫声的行为
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 动态改变飞翔行为
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
