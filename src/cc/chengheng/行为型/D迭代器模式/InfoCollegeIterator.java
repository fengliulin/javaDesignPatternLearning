package cc.chengheng.行为型.D迭代器模式;

import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院迭代器
 */
public class InfoCollegeIterator implements Iterator<Department> {

    /** 信息工程大学以List方式存放系 */
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size()-1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }

    /** 空实现remove */
    @Override
    public void remove() {

    }
}
