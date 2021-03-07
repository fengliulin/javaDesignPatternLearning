package cc.chengheng.行为型.C访问者模式;

/**
 * 说明：
 *      1、这里我们使用了双分派，即首先在客户端程序中，将具体的状态作为参数传递到Woman中（第一次分派）
 *      2、然后Woman类调用作为参数的"具体方法"中的方法getWomanResult，同时将自己的this作为参数
 *         传入，完成了（第二次的分派）
 */
public class Woman extends Person {
    /**
     * 提供一个方法，让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        // 谁访问反向访问谁
        action.getWomanResult(this); // 反向调用Action，也就是访问者
    }
}
