package cc.chengheng.七大原则.D里氏替换原则.改进;

public class LisKov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("=================================");

        // 因为B类不再继承A类，因此调用者，不会再func1是求减法
        //调用完成的功能就会很明确
        B b = new B();
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));

        // 使用组合仍然可以使用到A类相关方法
        System.out.println("11-3=" + b.func3(11, 3));
    }
}

// 创建一个更加基础的基类
class Base {
    // 把更加基础的方法和成员写到Base类

}

class A extends Base{
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// 增加了一个新的功能：完成两个数相加，然后和9求和
class B extends Base{
    // 如果B需要使用A类的方法，使用组合关系
    private A a = new A();

    // 这里重写了A类的方法，可能是无意识的，调用的时候一位还是掉父类的的，单实际重写了，调用了相加

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    // 我们让然想使用A的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
