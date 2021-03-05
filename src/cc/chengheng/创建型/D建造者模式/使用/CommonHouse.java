package cc.chengheng.创建型.D建造者模式.使用;

public class CommonHouse extends AbstractHouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10厘米");
    }

    /** 墙 */
    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
