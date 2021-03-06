package cc.chengheng.结构型.F享元模式;

public class jdk享元模式追溯 {
    public static void main(String[] args) {
        /*
         * Integer.valueOf(127); 如果在-128 到 127 之间，就使用享元模式返回
         *
         * 小结：
         *      在valueOf中， 先判断是否在IntegerCache中，如果不再就创建新的对象，否则就从缓存池中拿
         *      cache = new Integer[(high - low) + 1];
         */
        Integer x = Integer.valueOf(127); // 得到x实例，类型 Integer
        Integer y = new Integer(127); // 得到y实例，类型 Integer
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println(x.equals(y));    // true
        System.out.println(x == y);         // false
        System.out.println(x == z);         // true
        System.out.println(w == x);         // false
        System.out.println(w == y);         // false

        /*
         * 因为不再-128 到 127 之间，就返回一个新对象
         */
        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println(x1 == x2); // false
    }
}
