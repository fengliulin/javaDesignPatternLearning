package cc.chengheng.行为型.F中介者模式;

/**
 * 同事类
 */
public abstract class AbstractColleague {

    /** 中介者 */
    private final AbstractMediator mediator;

    protected String name;

    public AbstractColleague(AbstractMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public AbstractMediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int stateChange);
}
