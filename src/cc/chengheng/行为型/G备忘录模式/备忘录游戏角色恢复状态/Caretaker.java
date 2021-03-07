package cc.chengheng.行为型.G备忘录模式.备忘录游戏角色恢复状态;

import java.util.HashMap;
import java.util.List;

/**
 * 守护者对象，保存游戏角色的状态
 */
public class Caretaker {

    /** 保存一次状态 */
    private Memento memento;

    /** 对GameRole 保存多次状态*/
    //private List<Memento> mementoList;

    /** 对多个游戏角色保存多个状态 */
    //private HashMap<String, List<Memento>> rolesMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
