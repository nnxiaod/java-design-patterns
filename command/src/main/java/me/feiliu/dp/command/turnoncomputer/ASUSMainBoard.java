package me.feiliu.dp.command.turnoncomputer;

/**
 * 华硕主板
 */
public class ASUSMainBoard implements IMainBoard {

    @Override
    public void on() {
        System.out.println("华硕主板现在正在开机，请等候");
        System.out.println("接通电源......");
        System.out.println("设备检查......");
        System.out.println("装载系统......");
        System.out.println("机器正常运转起来......");
        System.out.println("机器已经正常打开，请等候");
    }

    @Override
    public void off() {
        System.out.println("华硕现在正在关机，请等候");
        System.out.println("卸载系统......");
        System.out.println("切断电源......");
        System.out.println("机器已经正常关闭");
    }
}
