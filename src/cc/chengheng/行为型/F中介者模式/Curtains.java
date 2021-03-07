package cc.chengheng.行为型.F中介者模式;

public class Curtains extends AbstractColleague {

    public Curtains(AbstractMediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, this.name);
    }

    public void upCurtains() {
        System.out.println("我升起窗帘!");
    }
}
