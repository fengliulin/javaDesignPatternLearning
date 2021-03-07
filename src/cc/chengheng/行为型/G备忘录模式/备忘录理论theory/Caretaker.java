package cc.chengheng.行为型.G备忘录模式.备忘录理论theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 守护着对象，负责保存多个
 */
public class Caretaker {

    /** 在List集合中会有很多的备忘录对象 */
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 获取第index个Originator的备忘录对象(即保存状态)
     * @param index
     * @return
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
