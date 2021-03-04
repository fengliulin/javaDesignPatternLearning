package cc.chengheng.创建型.C原型模式.深拷贝.通过对象序列化实现深拷贝_推荐;

public class Client {
    public static void main(String[] args) {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛类");


        // 通过对象序列化实现深拷贝
        DeepProtoType p2 = null;
        p2 = (DeepProtoType)p.deepClone();

        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }
}
