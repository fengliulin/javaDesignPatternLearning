package cc.chengheng.行为型.K职责链模式;

/**
 * 教学主任审批
 */
public class DepartmentApproval extends AbstractApproval {

    public DepartmentApproval(String name) {
        super(name);
    }

    /**
     * 流程要求 <br>
     *
     * @param purchaseRequest 
     */
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("请求编号 id= " + purchaseRequest.getId() + " 被 " +
                    super.name + "处理");
        } else {
            approval.processRequest(purchaseRequest);
        }
    }
}
