package cc.chengheng.行为型.K职责链模式;

/**
 * 院长批准
 */
public class CollegeApproval extends AbstractApproval {

    public CollegeApproval(String name) {
        super(name);
    }

    /**
     * 流程要求 <br>
     *
     * @param purchaseRequest
     */
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求编号 id= " + purchaseRequest.getId() + " 被 " +
                    name + "处理");
        } else {
            approval.processRequest(purchaseRequest);
        }
    }
}
