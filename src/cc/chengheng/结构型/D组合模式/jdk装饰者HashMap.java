package cc.chengheng.结构型.D组合模式;

import java.util.HashMap;
import java.util.Map;

public class jdk装饰者HashMap {
    public static void main(String[] args) {

        /*
         * 说明：
         *  1、Map就是一个抽象的构建（类似我们的Component）
         *  2、HashMap是一个中间的构建（Composite）, 实现了相关方法
         *      put, putAll
         *  3、Node 是 HashMap的静态内部类，类似Leaf叶子节点, 这里就没有
         *      put, putAll 方法了
         *      static class Node<K,V> implements Map.Entry<K,V>
         */
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "东游记"); // 直接存放叶子节点(Node)

        Map<Integer, String> map = new HashMap<>();
        hashMap.put(1, "西游记");
        hashMap.put(2, "红楼梦");
        hashMap.putAll(map);

        System.out.println(hashMap);
    }
}
