package cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析;

import cc.chengheng.行为型.I状态模式.实际项目_借贷平台_订单流程_源码剖析.state.PublishState;

/**
 * 测试类
 */
public class ClientTest {


    public static void main(String[] args) {
        //创建 context 对象
        Context context = new Context();

        //将当前状态设置为 PublishState
        context.setState(new PublishState());

        System.out.println(context.getCurrentState());


        //		//publish --> not pay context.acceptOrderEvent(context);
        //		//not pay --> paid context.payOrderEvent(context);
//	// 失败, 检测失败时，会抛出异常
//	try {
	context.checkFailEvent(context);
//	System.out.println("流程正常..");
//	} catch (Exception e) {


//	System.out.println(e.getMessage());
//

    }
}
