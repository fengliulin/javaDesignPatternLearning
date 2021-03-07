package cc.chengheng.行为型.F中介者模式;

/**
 * 具体的同事类
 */
public class Alarm extends AbstractColleague {


    public Alarm(AbstractMediator mediator, String name) {
        super(mediator, name);
        // 在创建Alarm同事对象时，将自己放入到 ConcreteMediator 对象中[集合]
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 调用中介者对象的getMessage
        getMediator().getMessage(stateChange, name);
    }
}
