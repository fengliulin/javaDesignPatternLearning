package cc.chengheng.创建型.D建造者模式.使用;

// 指挥者，这里去指定制作流程,返回产品
public class HouseDirector {
    AbstractHouseBuilder houseBuilder = null;

    // 构造器传入 houseBuilder
    public HouseDirector(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter 传入 houseBuilder
    public void setHouseBuilder(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如果处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHose();
    }
}
