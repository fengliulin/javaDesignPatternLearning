package cc.chengheng.行为型.D迭代器模式;

import java.util.Iterator;

/**
 * 计算机学院
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("Java专业", "Java专业");
        addDepartment("PHP专业", "PHP专业");
        addDepartment("大数据专业", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public <T> Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
