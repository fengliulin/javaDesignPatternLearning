package cc.chengheng.创建型.C原型模式.深拷贝.通过对象序列化实现深拷贝_推荐;

import java.io.*;
import java.util.Objects;

public class DeepProtoType implements Serializable {
    public String name; //字符串类型
    public DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepProtoType() {
    }

    // 深拷贝：通过对象的序列化实现(推荐)
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        DeepProtoType copyObj = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 把当前对象输出到了内存里

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copyObj = (DeepProtoType)ois.readObject(); // 从内存里读取里面的数据给一个新的变量
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                Objects.requireNonNull(bos).close();
                if (oos != null) {
                    oos.close();
                }
                Objects.requireNonNull(bis).close();
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return copyObj;
    }
}
