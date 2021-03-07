package cc.chengheng.行为型.F中介者模式;

public class TV extends AbstractColleague {


    public TV(AbstractMediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }


    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, this.name);
    }


    public void StartTv() {
        System.out.println("现在开始 Tv!");
    }


    public void StopTv() {
        System.out.println("现在停止 Tv!");
    }
}
