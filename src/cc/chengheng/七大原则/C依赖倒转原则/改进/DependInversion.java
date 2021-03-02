package cc.chengheng.七大原则.C依赖倒转原则.改进;

public class DependInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXIn());
    }
}
// 定义一个接口
interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：Hello,World";
    }
}

class WeiXIn implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息： hello,ok";
    }
}

class Person {

    // 这里我们是对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
