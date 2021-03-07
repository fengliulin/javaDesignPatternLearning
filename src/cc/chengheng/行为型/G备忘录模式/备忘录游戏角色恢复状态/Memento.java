package cc.chengheng.行为型.G备忘录模式.备忘录游戏角色恢复状态;

public class Memento {

    /** 攻击 */
    private int attack;

    /** 防御 */
    private int defense;

    public Memento(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
