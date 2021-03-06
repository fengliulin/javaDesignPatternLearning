package cc.chengheng.结构型.F享元模式;

/**
 * 具体的网站
 */
public class ConcreteWebSite extends WebSite {

    /** 网站发布形式(类型) */
    private String type = ""; // 共享部分，内部状态

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为：" + type + " 在使用中.... 使用者" + user.getName());
    }
}
