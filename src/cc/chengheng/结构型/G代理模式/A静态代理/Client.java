package cc.chengheng.结构型.G代理模式.A静态代理;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao teacherDao = new TeacherDaoImpl();

        // 创建代理对象, 同时将被代理对象传递给代理对象
        TeacherDao teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();
    }
}
