package cc.chengheng.行为型.D迭代器模式;

import java.util.Iterator;
import java.util.List;

public class OutPut {

    // 学院的集合
    List<College> collegeList;

    public OutPut(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院，然后调用printDepartment输出各个学院的系
    public void printCollege() {
        // 从collegeList取出所有的学院, Java中List已经实现了Iterator
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()) {
            College next = iterator.next();
            System.out.println("===============" + next.getName() + "================");
            printDepartment(next.createIterator()); // 得到对应的迭代器
        }
    }

    // 输出 学院输出 系
    public void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department next = iterator.next();
            System.out.println(next.getName());
        }
    }
}
