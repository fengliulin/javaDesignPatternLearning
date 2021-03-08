package cc.chengheng.行为型.H解释器模式;

import java.util.HashMap;

/**
 * 表达式
 * 通过HashMap键值对，可以获取到变量的值
 */
public abstract class AbstractExpression {

    /**
     * 解释器  <br/>
     * 拿到的就是各个变量对应的值
     * a+b+c     HashMap{a=10, b=20, c=30}
     * @param var 类型：key 公式（表达式）参数[a,b,c]。value就是具体值
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
