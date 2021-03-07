package cc.chengheng.行为型.B命令模式;

/**
 * 没有任何命令，即空执行：用于初始化每个按钮，当调用空命令时，对象什么都不做
 * 其实，这也是一种设计模式,可以省掉对空的判断
 */
public class NoCommand implements Command {

    /** 执行动作（操作） */
    @Override
    public void execute() {

    }

    /** 撤销动作（操作） */
    @Override
    public void undo() {

    }
}
