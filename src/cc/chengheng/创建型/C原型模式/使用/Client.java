package cc.chengheng.创建型.C原型模式.使用;

public class Client {
    public static void main(String[] args) {
        // 原型完成对象创建
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep2 = null;
        Sheep sheep3 = null;
        Sheep sheep4 = null;
        Sheep sheep5 = null;

        try {
            sheep2 = (Sheep)sheep.clone();
            sheep3 = (Sheep)sheep.clone();
            sheep4 = (Sheep)sheep.clone();
            sheep5 = (Sheep)sheep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
