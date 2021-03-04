package cc.chengheng.设计模式.单例设计模式;

public class A饿汉式_静态变量 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

// 饿汉式(静态变量)
class Singleton {
    // 本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 构造器私有化，外部不能new
    private Singleton() {
    }

    // 提供一个公有的静态方法，返回一个实例对象
    public static Singleton getInstance() {
        return instance;
    }
}