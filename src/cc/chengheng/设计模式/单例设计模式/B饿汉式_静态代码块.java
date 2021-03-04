package cc.chengheng.设计模式.单例设计模式;

public class B饿汉式_静态代码块 {
    public static void main(String[] args) {
        SingletonStaticCodeBlock instance1 = SingletonStaticCodeBlock.getInstance();
        SingletonStaticCodeBlock instance2 = SingletonStaticCodeBlock.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

// 饿汉式(静态代码块)
class SingletonStaticCodeBlock {
    // 本类内部创建对象实例
    private static SingletonStaticCodeBlock instance;

    static { // 在静态代码块中，创建单例对象
        instance = new SingletonStaticCodeBlock();
    }

    // 构造器私有化，外部不能new
    private SingletonStaticCodeBlock() {
    }

    // 提供一个公有的静态方法，返回一个实例对象
    public static SingletonStaticCodeBlock getInstance() {
        return instance;
    }
}