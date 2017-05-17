package me.feiliu.dp.mediator;

/**
 * 具体中介者
 */
public class ConcreteMediator implements Mediator {

    private CDDriverColleague cdDriverColleague;

    private CPUColleague cpuColleague;

    private SoundCardColleague soundCardColleague;

    private VideoCardColleague videoCardColleague;

    public void setCdDriverColleague(CDDriverColleague cdDriverColleague) {
        this.cdDriverColleague = cdDriverColleague;
    }

    public void setCpuColleague(CPUColleague cpuColleague) {
        this.cpuColleague = cpuColleague;
    }

    public void setVideoCardColleague(VideoCardColleague videoCardColleague) {
        this.videoCardColleague = videoCardColleague;
    }

    public void setSoundCardColleague(SoundCardColleague soundCardColleague) {
        this.soundCardColleague = soundCardColleague;
    }

    @Override
    public void change(Colleague colleague) {
        if (colleague instanceof CDDriverColleague) {
            openCDAndReadData((CDDriverColleague) colleague);
        } else if (colleague instanceof CPUColleague) {
            openCPU((CPUColleague) colleague);
        }
    }

    // 打开CD，并读取数据
    private void openCDAndReadData(CDDriverColleague cdDriverColleague) {
        //获取光驱读取的数据
        String[] data = cdDriverColleague.getData();
        //把这些数据传递给CPU进行处理
        cpuColleague.executeData(data);
    }

    // CPU处理
    private void openCPU(CPUColleague cpuColleague) {
        //获取数据
        String videoData = cpuColleague.getVideoData();
        String soundData = cpuColleague.getSoundData();

        //显示数据
        videoCardColleague.showData(videoData);
        soundCardColleague.showData(soundData);

    }
}
