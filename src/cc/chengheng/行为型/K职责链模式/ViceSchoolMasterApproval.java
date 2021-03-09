package cc.chengheng.行为型.K职责链模式;

/**
 * 副校长审批
 */
public class ViceSchoolMasterApproval extends AbstractApproval {
    public ViceSchoolMasterApproval(String name) {
        super(name);
    }

    /**
     * 流程要求 <br>
     *
     * @param purchaseRequest
     */
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println("请求编号 id= " + purchaseRequest.getId() + " 被 " +
                    name + "处理");
        } else {
            approval.processRequest(purchaseRequest);
        }
    }
}
