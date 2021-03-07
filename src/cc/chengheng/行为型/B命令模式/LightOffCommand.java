package cc.chengheng.行为型.B命令模式;

/**
 * 电灯打开命令
 */
public class LightOffCommand implements Command {

    /** 聚合LightReceiver */
    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    /** 执行动作（操作） */
    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();
    }

    /** 撤销动作（操作） */
    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
