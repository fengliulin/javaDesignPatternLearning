package cc.chengheng.行为型.A模板方法模式.钩子方法改进;

/**
 * 豆浆
 */
public abstract class SoyMilk {

    /** 模板方法，make，模板方法可以做成final，不让子类去覆盖 */
    protected final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    /** 选材料 */
    protected void select() {
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    /** 添加调味品，不同的配料，子类具体去实现 */
    protected abstract void addCondiments();

    /** 侵泡 */
    protected void soak() {
        System.out.println("第三步：黄豆和配料开始侵泡，需要3个小时");
    }

    /** 放到豆浆机打碎 */
    protected void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }

    /**
     * 钩子方法，决定是否需要添加配料
     * customerWantCondiments 顾客需求的调味品
     */
    public boolean customerWantCondiments() {
        return true;
    }
}
