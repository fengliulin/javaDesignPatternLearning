package cc.chengheng.结构型.G代理模式.B动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    /** 维护一个目标对象 */
    private Object target;

    /**
     * 对目标对象进行初始化
     *
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象，生成一个代理对象
     */
    public Object getProxyInstance() {
        /*
         * public static Object newProxyInstance(ClassLoader loader,
         *                                 Class<?>[] interfaces,
         *                                 InvocationHandler h)
         * 说明：
         *      1、ClassLoader : 指定目标接口使用的类加载器，获取加载器的方法固定
         *      2、Class<?>[] ：目标对象实现的接口类型，使用泛型方法确认类型
         *      3、InvocationHandler：事件处理，执行目标方法的方法时，会触发事件处理器的方法
         *          会把当前执行的目标对象作为参数传递过来
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();

        return Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
            System.out.println("JDK代理开始");

            // 反射调用方法,传递一个对象
            System.out.println(method.getDeclaringClass());
            Object returnVal = method.invoke(target, args);
            return returnVal;
        });
    }

}
