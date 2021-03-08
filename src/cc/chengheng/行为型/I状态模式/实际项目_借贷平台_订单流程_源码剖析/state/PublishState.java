package cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.state;

import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.AbstractState;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.Context;
import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.StateEnum;

/**
 * 发布状态
 */
public class PublishState extends AbstractState {

    /**
     * 接收订单之后，改变未付款状态
     */
    @Override
    public void acceptOrderEvent(Context context) {
        //把当前状态设置为	NotPayState。。。
        //至于应该变成哪个状态，有流程图来决定
        context.setState(new NotPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }
}
