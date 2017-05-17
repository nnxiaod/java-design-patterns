package me.feiliu.dp.command.turnoncomputer;

/**
 * 调用者，本例中是电脑机箱
 */
public class ComputerMachineBox {

    private Command command;

    public void setOpenCommand(Command command) {
        this.command = command;
    }

    public void setCloseCommand(Command command) {
        this.command = command;
    }

    public void open() {
        command.execute();
    }

    public void close() {
        command.execute();
    }
}
