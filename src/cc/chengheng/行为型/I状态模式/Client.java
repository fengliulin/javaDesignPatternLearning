package cc.chengheng.行为型.I状态模式;

public class Client {
    public static void main(String[] args) {

        // 创建抽奖活动，初始化奖品数量1个奖品
        RaffleActivity activity = new RaffleActivity(1);

        for (int i = 0; i < 300; i++) {
            System.out.println("第" + (i+1) + "次抽奖");
            activity.deductMoney();
            activity.raffle();
        }
    }
}
