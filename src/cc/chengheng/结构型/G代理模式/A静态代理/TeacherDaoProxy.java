package cc.chengheng.结构型.G代理模式.A静态代理;

/**
 * 代理对象，静态代理
 */
public class TeacherDaoProxy implements TeacherDao {

    /** 目标对象，通过接口来聚合 */
    private TeacherDao target;

    /**
     * 构造目标对象
     * @param target
     */
    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    /** 授课的方法 */
    @Override
    public void teach() {
        System.out.println("开始代理......");

        target.teach();

        System.out.println("代理结束......");
    }
}
