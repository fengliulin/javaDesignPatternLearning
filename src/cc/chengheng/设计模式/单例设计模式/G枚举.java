package cc.chengheng.设计模式.单例设计模式;

public class G枚举 {
    public static void main(String[] args) {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        instance1.sayOK();
    }
}

// 使用枚举，可以实现单例，推荐使用
enum SingletonEnum {
    INSTANCE; // 属性
    public void sayOK() {
        System.out.println("ok~~~~~~~");
    }
}
