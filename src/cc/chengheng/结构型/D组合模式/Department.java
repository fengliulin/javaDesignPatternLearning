package cc.chengheng.结构型.D组合模式;

/**
 * 各个系
 */
public class Department extends OrganizationComponent {

    // 没有集合了

    public Department(String name, String des) {
        super(name, des);
    }

    // add, remove 就不用写了，因为它是叶子节点


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
