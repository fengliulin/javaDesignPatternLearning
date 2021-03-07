package cc.chengheng.行为型.F中介者模式;

public class Client {

    public static void main(String[] args) {
        // 创建一个中介者对象
        AbstractMediator mediator = new ConcreteMediator();

        // 创建Alarm 并且加入到ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator,
                "传递名字无意义，主要学习同事类的对象去注册到中介类，同事类之间互相不建立任何联系，通过中介建立联系");

        // 创建了CoffeeMachine对象，并且加入到ConcreteMediator 对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "CoffeeMachine");

        // 创建了Curtains对象，并且加入到ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");

        // 创建了TV对象，并且加入到ConcreteMediator 对象的HashMap
        TV tv = new TV(mediator, "TV");

        // 让闹钟发出消息
        alarm.sendAlarm(0);

        // 咖啡煮好了
        coffeeMachine.finishCoffee();

        //
        alarm.sendAlarm(1);
    }
}
