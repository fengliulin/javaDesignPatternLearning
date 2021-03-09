package cc.chengheng.行为型.K职责链模式;

public class Client {
    public static void main(String[] args) {
        // 创建一个采购请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 100000, 1);

        // 创建教学主任审批人
        DepartmentApproval departmentApproval = new DepartmentApproval("张主任");

        // 创建院长审批人
        CollegeApproval collegeApproval = new CollegeApproval("李院长");

        // 创建副校长审批人
        ViceSchoolMasterApproval viceSchoolMasterApproval = new ViceSchoolMasterApproval("张副校");

        // 创建校长审批
        SchoolMasterApproval schoolMasterApproval = new SchoolMasterApproval("冯校长");

        // 需要将各个审批级别的下一个设置好(处理:形成环形)
        departmentApproval.setApproval(collegeApproval);
        collegeApproval.setApproval(viceSchoolMasterApproval);
        viceSchoolMasterApproval.setApproval(schoolMasterApproval);
        schoolMasterApproval.setApproval(departmentApproval);

        // 如果审批人之间没有设置环形，要从第一个最小的开始找，否则会空指针
        schoolMasterApproval.processRequest(purchaseRequest);
    }
}
