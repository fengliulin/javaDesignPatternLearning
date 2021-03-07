package cc.chengheng.行为型.C访问者模式;

public abstract class Action {
    /** 得到男性的测评 */
    public abstract void getManResult(Man man);

    /** 得到女的测评 */
    public abstract void getWomanResult(Woman woman);
}
