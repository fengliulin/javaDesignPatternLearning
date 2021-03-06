package cc.chengheng.结构型.G代理模式.cglib代理;

import net.sf.cglib.core.DebuggingClassWriter;

public class Client {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/fengliulin/Documents");
        // 创建目标对象
        TeacherDao target = new TeacherDao();

        // 获取代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

        // 执行代理对象的方法,触发intecept 方法，从而实现对目标对象的调用
        String teach = proxyInstance.teach();
        System.out.println(teach);
    }

}
