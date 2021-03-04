package cc.chengheng.设计模式.单例设计模式;

public class E懒汉式_线程安全_同步代码块_DoubleCheck {
    public static void main(String[] args) {
        SingletonSynchronizationCodeBlock instance1 = SingletonSynchronizationCodeBlock.getInstance();
        SingletonSynchronizationCodeBlock instance2 = SingletonSynchronizationCodeBlock.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class SingletonSynchronizationCodeBlock {

    // 添加volatile，一旦变量有修改，立即刷新到主存里，别的线程可以看到
    //volatile 关键字，当多个线程进行操作共享数据时候，可以保存内存中的数据可见。
    private static volatile SingletonSynchronizationCodeBlock instance;

    private SingletonSynchronizationCodeBlock() {
    }

    // 提供一个静态的公有方法，加入了同步处理的代码，解决了一个线程安全问题
    // 同时解决了懒加载问题，同步保证了效率，推荐使用
    public static SingletonSynchronizationCodeBlock getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {  // 同步+双重检查，因为只能一个线程进入
                    instance = new SingletonSynchronizationCodeBlock();
                }
            }
        }
        return instance;
    }
}
