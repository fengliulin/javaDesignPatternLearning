package cc.chengheng.行为型.H解释器模式;

import java.util.HashMap;

/**
 * 变量的解释器
 */
public class VarExpression extends AbstractExpression {

    private String key; // key=a, kye=b, key=c

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量名称，返回对应值
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
