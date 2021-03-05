package cc.chengheng.创建型.D建造者模式.使用;

public class HighBuilding extends AbstractHouseBuilder {
    /** 地基 */
    @Override
    public void buildBasic() {
        System.out.println("高楼的打地基100米");
    }

    /** 墙 */
    @Override
    public void buildWalls() {
            System.out.println("高楼的砌墙20cm");
    }

    /** 墙 */
    @Override
    public void roofed() {
        System.out.println("高楼的透明屋顶");
    }
}