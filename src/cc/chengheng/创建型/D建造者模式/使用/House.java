package cc.chengheng.创建型.D建造者模式.使用;

/**
 * 产品 -> Product
 */
public class House {


    /** 地基 */
    private String basic;

    /** 墙 */
    private String wall;

    /** 屋顶 */
    private String roofed;

    public String getBase() {
        return basic;
    }

    public void setBase(String base) {
        this.basic = base;
    }

    public String getWall() {
        //region 设置手机信号模块
        return wall;
        //endregion
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
