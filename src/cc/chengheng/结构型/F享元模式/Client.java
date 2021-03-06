package cc.chengheng.结构型.F享元模式;

public class Client {
    public static void main(String[] args) {
        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        // 客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSizeCategory("新闻");
        webSite1.use(new User("Tom"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSizeCategory("博客");
        webSite2.use(new User("jack"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSizeCategory("博客");
        webSite3.use(new User("smith"));

        System.out.println("网站的分类共= " + factory.getWebSiteCount());
    }
}
