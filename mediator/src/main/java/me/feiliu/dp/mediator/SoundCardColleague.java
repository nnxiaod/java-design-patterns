package me.feiliu.dp.mediator;

/**
 * 声卡同事
 */
public class SoundCardColleague extends Colleague {

    public SoundCardColleague(Mediator mediator) {
        super(mediator);
    }

    // 显示声音数据源
    public void showData(String data) {
        System.out.println("您正在听：" + data);
    }
}
