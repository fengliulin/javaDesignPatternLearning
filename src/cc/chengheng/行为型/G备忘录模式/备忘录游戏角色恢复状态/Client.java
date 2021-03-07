package cc.chengheng.行为型.G备忘录模式.备忘录游戏角色恢复状态;

public class Client {
    public static void main(String[] args) {
        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setAttack(100);
        gameRole.setDefense(100);

        System.out.println("============和boss大战前的状态============");
        gameRole.display();

        // 把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();

        // 把之前的状态保存到备忘录，gameRole.createMemento() 创建的时候直接生成了对象并传递攻击和防御
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("============和boss大战============");
        gameRole.setAttack(50);
        gameRole.setDefense(30);

        gameRole.display();

        System.out.println("============大战后,使用备忘录对象恢复元气============");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento()); // 从备忘录恢复
        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
