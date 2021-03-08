package cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.state;

import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.AbstractState;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.Context;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.StateEnum;

/**
 * 未付款状态
 */
public class NotPayState extends AbstractState {

    @Override
    public void payOrderEvent(Context context) { context.setState(new PaidState());
    }

    public void feedBackEvent(Context context) { context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }
}
