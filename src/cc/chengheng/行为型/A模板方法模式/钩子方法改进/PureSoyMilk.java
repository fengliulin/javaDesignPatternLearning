package cc.chengheng.行为型.A模板方法模式.钩子方法改进;

/**
 * 纯豆浆
 */
public class PureSoyMilk extends SoyMilk {
    @Override
    protected void addCondiments() {

    }

    /**
     * 钩子方法，决定是否需要添加配料
     * customerWantCondiments 顾客需求的调味品
     */
    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
