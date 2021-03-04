package cc.chengheng.设计模式.单例设计模式;

public class F静态内部类 {
    public static void main(String[] args) {
        SingletonOuter instance1 = SingletonOuter.getInstance();
        SingletonOuter instance2 = SingletonOuter.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class SingletonOuter {
    // 本类内部创建对象实例
    private static SingletonOuter instance;

    // 构造器私有化，外部不能new
    private SingletonOuter() {
    }

    // 写一个静态内部类，该类中有一个静态属性
    private static class SingletonInnerInstance {
        private final static SingletonOuter INSTANCE = new SingletonOuter();
    }

    // 提供一个公有的静态方法，返回一个SingletonInnerInstance.INSTANCE;
    public static SingletonOuter getInstance() {
        return SingletonInnerInstance.INSTANCE; // 调用的时候，静态内部类才会装载，jvm类装载的时候线程是安全的
    }
}