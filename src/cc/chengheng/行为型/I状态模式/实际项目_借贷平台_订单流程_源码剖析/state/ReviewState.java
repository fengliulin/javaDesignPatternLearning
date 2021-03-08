package cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.state;

import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.AbstractState;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.Context;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.StateEnum;

/**
 * 审查状态
 */
public class ReviewState extends AbstractState {


    @Override
    public void makePriceEvent(Context context) { context.setState(new PublishState());
    }



    @Override
    public String getCurrentState() { return StateEnum.REVIEWED.getValue();
    }


}
