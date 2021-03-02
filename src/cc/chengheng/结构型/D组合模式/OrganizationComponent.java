package cc.chengheng.结构型.D组合模式;

import java.util.ArrayList;
import java.util.List;

public abstract class OrganizationComponent {

    /** 名字 */
    private String name;

    /** 说明 */
    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现, 叶子结点是不需要重写这个方法的，所以不需要做成抽象方法
        throw new UnsupportedOperationException();

    }

    protected void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    // 子类都需要实现
    protected abstract void print();
}
