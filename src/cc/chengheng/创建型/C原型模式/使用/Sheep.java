package cc.chengheng.创建型.C原型模式.使用;

public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private String color;
    private String address = "蒙古羊";

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // 克隆实例， 使用默认的clone方法来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
