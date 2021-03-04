package cc.chengheng.创建型.A单例设计模式;

public class C懒汉式_线程不安全 {
    public static void main(String[] args) {
        SingletonThreadUnsafe instance1 = SingletonThreadUnsafe.getInstance();
        SingletonThreadUnsafe instance2 = SingletonThreadUnsafe.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class SingletonThreadUnsafe {
    private static SingletonThreadUnsafe instance;

    private SingletonThreadUnsafe() {
    }

    // 提供一个静态的公有方法，当使用到该方法时，才去创建instance, 就是 懒汉式
    public static SingletonThreadUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadUnsafe();
        }
        return instance;
    }
}
