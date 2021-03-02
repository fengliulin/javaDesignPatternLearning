package cc.chengheng.七大原则.C依赖倒转原则;

public class DependInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：Hello,World";
    }
}

/**
 * 完成Person接收消息的功能
 * 方式1完成
 * 1、简单，比较容易想到
 * 2、如果我们获取的对象是微信，短信等等，则需要新增类，同时Person也要增加相应的方法
 * 3、解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口发生依赖
 *            因为Email，微信，等等属于接收的范围，他们各自实现IReceiver，接口就ok
 *            这样我们符合依赖倒转原则
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
