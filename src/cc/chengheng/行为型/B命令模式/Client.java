package cc.chengheng.行为型.B命令模式;

public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式，完成通过遥控器，对电灯的操作

        // 创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();

        // 创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);


        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给我们的遥控器设置相关命令, 比如no = 0 是电灯的开和关的操作
        remoteController.setOnCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------------按下灯开的按钮-------------");
        remoteController.onButtonWawPushed(0);

        System.out.println("--------------按下灯关的按钮-------------");
        remoteController.offButtonWawPushed(0);

        System.out.println("--------------按下撤销的按钮-------------");
        remoteController.undoButtonWasPushed();



    }
}
