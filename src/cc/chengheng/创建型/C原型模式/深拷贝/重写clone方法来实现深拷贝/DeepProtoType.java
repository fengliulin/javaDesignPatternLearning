package cc.chengheng.创建型.C原型模式.深拷贝.重写clone方法来实现深拷贝;

import java.io.*;
import java.util.Objects;

public class DeepProtoType implements Cloneable {
    public String name; //字符串类型
    public DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepProtoType() {
    }

    // 深拷贝 - 方式一：使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;

        // 这里完成对基本数据类型和字符串的克隆
        deep = super.clone();

        // 对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();

        return  deepProtoType;
    }
}
