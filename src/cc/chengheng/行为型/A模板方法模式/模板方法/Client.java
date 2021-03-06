package cc.chengheng.行为型.A模板方法模式.模板方法;

public class Client {
    public static void main(String[] args) {
        // 制作红豆豆浆
        System.out.println("------------制作红豆豆浆------------");
        SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        // 制作花生豆浆
        System.out.println("------------制作花生豆浆------------");
        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
    }
}
