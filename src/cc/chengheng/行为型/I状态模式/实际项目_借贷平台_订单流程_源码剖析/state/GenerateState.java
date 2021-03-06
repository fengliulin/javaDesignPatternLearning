package cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.state;

import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.AbstractState;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.Context;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.StateEnum;

/**
 * 通用状态
 */
public class GenerateState extends AbstractState {

    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    @Override
    public void checkFailEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }
}

