package cc.chengheng.行为型.H解释器模式;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

    public SubExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    /**
     * 处理相减结果
     * var 让然是 {a=10, b=20}
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
