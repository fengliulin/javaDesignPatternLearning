package cc.chengheng.行为型.F中介者模式;

public abstract class AbstractMediator {

    /** 将给中介者对象，加入到集合中 */
    public abstract void register(String colleagueName, AbstractColleague colleague);

    /** 接收消息, 具体的同事对象发出 */
    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
