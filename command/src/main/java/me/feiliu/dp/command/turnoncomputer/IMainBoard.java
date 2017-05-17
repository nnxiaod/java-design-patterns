package me.feiliu.dp.command.turnoncomputer;

/**
 * 命令接收者，本例中是主板
 */
public interface IMainBoard {

    /**
     * 开机
     */
    void on();

    /**
     * 关机
     */
    void off();

}
