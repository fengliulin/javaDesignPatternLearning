package cc.chengheng.行为型.K职责链模式;

/**
 * 采购请求
 */
public class PurchaseRequest {

    /** 请求类型 */
    private Integer type;

    /** 请求的金额 */
    private float price;

    private Integer id;

    public PurchaseRequest(Integer type, float price, Integer id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }
}
