package cc.chengheng.结构型.C装饰者模式;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class jdkIO装饰者模式源码追溯 {
    public static void main(String[] args) throws Exception {

        /*
         * 说明
         *  1、InputStream 是抽象类，类似我们咖啡里面的Drink
         *  2、FileInputStream 是 InputStream 子类，类似我们前面的 LongBLack，具体的单品咖啡
         *  3、FilterInputStream 是 InputStream 子类: 类似我们前面的 Decorator 装饰者
         *  4、DataInputStream 是 FilterInputStream 子类，具体的修饰者， 类似前面的 Milk,Soy
         *  5、FilterInputStream 有 protected volatile InputStream in; 即被装饰者
         *  6、分析得出在jdk的io体系中，就是使用了装饰者模式
         */

        DataInputStream dis = new DataInputStream(new FileInputStream("/Users/fengliulin/Documents/abc.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
