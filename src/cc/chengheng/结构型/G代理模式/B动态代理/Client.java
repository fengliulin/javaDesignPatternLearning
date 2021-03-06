package cc.chengheng.结构型.G代理模式.B动态代理;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDaoImpl target = new TeacherDaoImpl();

        // 给目标对象创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(target);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();

        // proxyInstance=class cc.chengheng.结构型.G代理模式.B动态代理.$Proxy0
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        //通过代理对象调用目标对象方法
        proxyInstance.teach();
    }
}
