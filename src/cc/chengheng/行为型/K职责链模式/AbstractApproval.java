package cc.chengheng.行为型.K职责链模式;

/**
 * 批准
 */
public abstract class AbstractApproval {

    /** 下一个处理者 */
    AbstractApproval approval;

    String name;

    public AbstractApproval(String name) {
        this.name = name;
    }

    /**
     * 下一个处理者
     * @param approval
     */
    public void setApproval(AbstractApproval approval) {
        this.approval = approval;
    }

    /**
     * 流程要求 <br>
     * 处理审批的请求方法，得到一个请求，处理是子类完成的，因为该方法做成抽象
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
