package cc.chengheng.行为型.C访问者模式;

public class Wait extends Action {
    /**
     * 得到男性的测评
     *
     * @param man
     */
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手待定");
    }

    /**
     * 得到女的测评
     *
     * @param woman
     */
    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是该歌手待定");
    }
}
