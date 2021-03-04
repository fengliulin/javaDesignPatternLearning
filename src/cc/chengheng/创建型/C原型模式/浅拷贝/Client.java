package cc.chengheng.创建型.C原型模式.浅拷贝;

public class Client {
    public static void main(String[] args) {
        // 原型完成对象创建
        Sheep sheep = new Sheep("tom", 1, "白色");

        // 克隆，数据类型是引用类型，拷贝的是引用，浅拷贝
        sheep.friend = new Sheep("jack", 2, "黑色");

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

        System.out.println("sheep = "  + sheep +   "sheep.friend=" + sheep.friend.hashCode());
        System.out.println("sheep2 = " + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 = " + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 = " + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 = " + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }
}
