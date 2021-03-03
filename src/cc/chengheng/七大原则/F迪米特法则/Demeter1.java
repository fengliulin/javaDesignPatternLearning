package cc.chengheng.七大原则.F迪米特法则;

import java.util.ArrayList;
import java.util.List;

// 客户端，使用者
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManage = new SchoolManager();

        // 输出学院的员工id和学校总部的员工信息
        schoolManage.printAllEmployee(new CollegeManager());
    }
}

// 学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院的员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManager {

    /**
     * @return 返回学院的所有员工
     */
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();

        // 这里增加了10个员工到list集合
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }
}

// 学校管理类

// 分析直接朋友有哪些 Employee、CollegeManager
// 不是直接朋友,而是一个陌生类CollegeEmployee，这样就违背了迪米特法则
class SchoolManager {

    /**
     * @return 返回学院总部的所有员工
     */
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();

        // 这里增加了5个员工到list集合
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学院总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 完成输出学校总部和学院员工信息(id)
     * @param sub
     */
    public void printAllEmployee(CollegeManager sub) {

        /*
         * 1、CollegeEmployee 不是 SchoolManager 的直接朋友
         * 2、CollegeEmployee 是以局部变量的方式出现在 SchoolManager
         * 3、违反了迪米特法则
         */
        // 获取到学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee(); /* 不是直接朋友 */
        System.out.println("--------------------学院员工--------------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }

        // 获取到学校总部的员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("--------------------学校总部员工--------------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}