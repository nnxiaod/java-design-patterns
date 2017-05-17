package me.feiliu.dp.mediator;

/**
 * 显卡同事
 */
public class VideoCardColleague extends Colleague {

    public VideoCardColleague(Mediator mediator) {
        super(mediator);
    }

    // 显示图像数据源
    public void showData(String data) {
        System.out.println("您正在看：" + data);
    }
}
