package cc.chengheng.创建型.C原型模式.深拷贝.重写clone方法来实现深拷贝;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

    private final static long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 该类的属性都是String，我们用默认的clone即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
