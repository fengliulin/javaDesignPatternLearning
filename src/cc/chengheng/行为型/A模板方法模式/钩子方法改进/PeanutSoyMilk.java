package cc.chengheng.行为型.A模板方法模式.钩子方法改进;

/**
 * 花生豆浆
 */
public class PeanutSoyMilk extends SoyMilk {
    @Override
    protected void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
