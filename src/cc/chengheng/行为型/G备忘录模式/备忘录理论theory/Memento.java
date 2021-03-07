package cc.chengheng.行为型.G备忘录模式.备忘录理论theory;

/**
 * 备忘录模式
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
