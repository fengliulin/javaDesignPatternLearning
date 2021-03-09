package cc.chengheng.行为型.J策略模式.策略模式改进;

import java.util.Arrays;
import java.util.Comparator;

public class 策略模式jdk源码Arrays {
    public static void main(String[] args) {
        // 数组
        Integer[] data = new Integer[]{
                9, 1, 2, 8, 4, 3 // 实现升序排序， -1：方左边 0：放右边 0：保持不变
        };

        /*
         * 说明：
         *  实现了Comparator接口（策略接口）
         *  实现了策略接口对象，匿名对象
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 == o2){
                    return 0;
                } else {
                    return -1;
                }
            }
        };

        Arrays.sort(data, comparator);
        System.out.println(Arrays.toString(data));

    }
}
