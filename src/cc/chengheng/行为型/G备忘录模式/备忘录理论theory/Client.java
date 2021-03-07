package cc.chengheng.行为型.G备忘录模式.备忘录理论theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态#1 血量100");

        // 保存了当前状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#2 血量80");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#3 血量50");
        caretaker.add(originator.saveStateMemento());


        System.out.println("当前的状态是 = " +originator.getState());

        // 希望恢复状态 1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1 = " +originator.getState());
    }
}
