package cc.chengheng.创建型.B工厂设计模式;

import java.util.Calendar;

public class JDK源码工厂模式追溯 {

    public static void main(String[] args) {

        // getInstance 是 Calendar的静态方法
        Calendar cal = Calendar.getInstance();

        // 注意月份下表从0开始，所以月份要+1
        System.out.println("年:" + cal.get(Calendar.YEAR));
        System.out.println("月:" + cal.get(Calendar.MONTH));
        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));
    }
}
