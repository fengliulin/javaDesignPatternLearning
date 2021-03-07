package cc.chengheng.行为型.D迭代器模式;

import java.util.Iterator;

/**
 * 计算机学院的迭代器
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    // 我们需要Department 是以怎么的方式存放 =》 数组
    Department[] departments;
    int position = 0; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /** 判断是否还有下一个元素 */
    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Department next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    /** 删除的方法，默认空实现 */
    @Override
    public void remove() {

    }
}
