package cc.chengheng.七大原则.C依赖倒转原则.依赖的传递的三种方式;

public class DependPass {
    public static void main(String[] args) {

    }
}

// 方式1、通过接口传递实现依赖

//开关接口
interface IOpenAndClose1 {
    public void open(ITV1 tv); // 抽象方法，接口接口
}

interface ITV1 {
    void play();
}

class OpenAndClose1 implements IOpenAndClose1 {
    @Override
    public void open(ITV1 tv) {
        tv.play();
    }
}

// 方式2、通过构造器依赖传递
interface IOpenAndClose2 {
    void open(); // 抽象方法
}

interface ITV2 {
    void play();
}

class OpenAndClose2 implements IOpenAndClose2 {
    private ITV2 tv;

    public OpenAndClose2(ITV2 tv) { // 构造器传递
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

// 方式3、通过setter方法传递
interface IOpenAndClose3 {
    void open(); // 抽象方法
    void setTv(ITV3 tv);
}

interface ITV3 {
    void play();
}

class OpenAndClose3 implements IOpenAndClose3 {
    private ITV3 tv;

    @Override
    public void setTv(ITV3 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}