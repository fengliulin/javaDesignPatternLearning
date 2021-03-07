package cc.chengheng.行为型.G备忘录模式.备忘录游戏角色恢复状态;

/**
 * 游戏角色
 */
public class GameRole {

    /** 攻击 */
    private int attack;

    /** 防御 */
    private int defense;

    /**
     * 创建Memento，根据当前状态得到Memento
     * @return
     */
    public Memento createMemento() {
        return new Memento(attack, defense);
    }

    /**
     * 从备忘录对象，恢复GameRole之前的状态
     */
    public void recoverGameRoleFromMemento(Memento memento) {
        defense = memento.getDefense();
        attack = memento.getAttack();
    }

    /**
     * 显示当前游戏角色的状态
     */
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + attack + " 防御力：" + defense);
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
