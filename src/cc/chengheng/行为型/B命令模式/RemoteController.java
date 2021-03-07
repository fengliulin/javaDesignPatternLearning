package cc.chengheng.行为型.B命令模式;

/**
 * 遥控器
 */
public class RemoteController {

    //region 开 按钮的命令组
    Command[] onCommands;
    Command[] offCommands;
    //endregion

    /** 执行撤销命令 */
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给我们的按钮设置需要的命令
     */
    public void setOnCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     */
    public void onButtonWawPushed(int no) {
        // 找到你按下的【开】按钮，并调用对应的方法
        onCommands[no].execute();

        // 记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     */
    public void offButtonWawPushed(int no) {
        // 找到你按下的【开】按钮，并调用对应的方法
        offCommands[no].execute();

        // 记录这次操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     *
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
