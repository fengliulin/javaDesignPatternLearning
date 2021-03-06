package cc.chengheng.结构型.F享元模式;

import java.util.HashMap;

/**
 * 网站工厂，根据需求返回一个网站
 */
public class WebSiteFactory {

    /** 集合，充当池的作用 */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中
     */
    public WebSite getWebSizeCategory(String type) {
        // 类型不同，就创建新的对象，如果相同，就取出来重复使用
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * 获取网站分类的总数(池中有多少个网站类型)
     */
    public int getWebSiteCount() {
        return pool.size();
    }


}
