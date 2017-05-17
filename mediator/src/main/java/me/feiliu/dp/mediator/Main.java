package me.feiliu.dp.mediator;

/**
 *
 * 来源：http://www.cnblogs.com/zxj159/p/3466115.html
 *
 * 客户端
 * <p>
 * 1.首先光驱读取光盘上的数据，然后告诉主板，它的状态已经改变了。
 * <p>
 * 2.主板得到光驱的数据，将数据交给CPU进行分析处理。
 * <p>
 * 3.CPU处理完，将数据分成了视频数据和音频数据，通知主板，已将处理好了。
 * <p>
 * 4.主板得到数据，将数据交给显卡和声卡进行输出。
 */
public class Main {

    public static void main(String[] args) {
        //1.创建中介者——主板对象
        ConcreteMediator mediator = new ConcreteMediator();

        //2.创建同事类
        CDDriverColleague cd = new CDDriverColleague(mediator);
        CPUColleague cpu = new CPUColleague(mediator);
        VideoCardColleague videoCard = new VideoCardColleague(mediator);
        SoundCardColleague soundCard = new SoundCardColleague(mediator);

        //3.让中介知道所有的同事
        mediator.setCdDriverColleague(cd);
        mediator.setCpuColleague(cpu);
        mediator.setVideoCardColleague(videoCard);
        mediator.setSoundCardColleague(soundCard);

        //4.开始看电影
        cd.readCD();

    }
}
