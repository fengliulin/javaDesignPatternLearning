package cc.chengheng.创建型.B工厂设计模式.C抽象工厂模式.pizza;

/**
 * 披萨
 */
public abstract class Pizza {

    /** 披萨的名字 */
    private String name;

    /** 准备原材料,不同的披萨原材料不一样,因此我们做成抽象方法 */
    public abstract void prepare();

    /** 烘烤 */
    public void bake() {
        System.out.println(name + "baking");
    }

    /** 切割，对面包切割成不同的大小 */
    public void cut() {
        System.out.println(name + "cutting");
    }

    /** 包装 */
    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
