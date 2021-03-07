package cc.chengheng.行为型.G备忘录模式.备忘录理论theory;

/**
 * 原来的对象
 */
public class Originator {

    /** 状态 */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存一个状态对象
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象，恢复状态
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
