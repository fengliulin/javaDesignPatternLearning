package cc.chengheng.七大原则.D里氏替换原则;

public class LisKov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("=================================");

        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// 增加了一个新的功能：完成两个数相加，然后和9求和
class B extends A{

    // 这里重写了A类的方法，可能是无意识的，调用的时候一位还是掉父类的的，单实际重写了，调用了相加
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
