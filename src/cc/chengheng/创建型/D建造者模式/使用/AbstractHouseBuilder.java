package cc.chengheng.创建型.D建造者模式.使用;

/** 抽象的建造者 */
public abstract class AbstractHouseBuilder {
    protected House house = new House();

    /** 地基 */
    public abstract void buildBasic();

    /** 墙 */
    public abstract void buildWalls();

    /** 墙 */
    public abstract void roofed();

    /** 建造房子 */
    public House buildHose() {
        return house;
    }
}
