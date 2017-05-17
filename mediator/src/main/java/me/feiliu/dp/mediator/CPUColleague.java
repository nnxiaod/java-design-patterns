package me.feiliu.dp.mediator;

/**
 * CPU同事
 */
public class CPUColleague extends Colleague {

    public CPUColleague(Mediator mediator) {
        super(mediator);
    }

    // 分解出来的视频数据
    private String videoData;

    // 分解出来的视频数据
    private String soundData;

    // 获取分解出来的视频数据
    public String getVideoData() {
        return videoData;
    }

    // 获取分解出来的声音数据
    public String getSoundData() {
        return soundData;
    }

    // 处理数据
    public void executeData(String[] data) {
        videoData = data[0];
        soundData = data[1];

        //通知主板，CPU工作已完成
        getMediator().change(this);
    }
}
