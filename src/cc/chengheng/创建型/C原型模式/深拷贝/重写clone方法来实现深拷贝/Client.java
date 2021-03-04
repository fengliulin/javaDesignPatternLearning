package cc.chengheng.创建型.C原型模式.深拷贝.重写clone方法来实现深拷贝;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛类");

        // 方式1：重写clone方法来实现深拷贝
        DeepProtoType p2 = null;
        try {
            p2 = (DeepProtoType)p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + Objects.requireNonNull(p2).name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

    }
}
