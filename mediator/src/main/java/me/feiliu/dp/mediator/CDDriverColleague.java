package me.feiliu.dp.mediator;

/**
 * CD驱动器同事
 */
public class CDDriverColleague extends Colleague {

    public CDDriverColleague(Mediator mediator) {
        super(mediator);
    }

    /// 光驱读取出来的数据
    private String[] data = new String[2];

    /// 获取光驱读取出来的数据
    public String[] getData() {
        return data;
    }

    public void readCD() {
        //第一个元素是视频数据，第二个元素是声音数据
        data[0] = "这是视频数据";
        data[1] = "这是声音数据";

        //通知主板，自己的状态反生了改变
        getMediator().change(this);
    }
}
