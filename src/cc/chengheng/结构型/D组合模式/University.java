package cc.chengheng.结构型.D组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    // 构造器
    public University(String name, String des) {
        super(name, des);
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    /** 输出 University 包含的学院
     * @return*/
    @Override
    protected void print() {
        System.out.println("-------------------" + getName() + "-------------------");

        // 遍历 organizationComponentList
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }
}
