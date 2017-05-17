package me.feiliu.dp.command.turnoncomputer;

/**
 * 具体命令，开机
 */
public class OpenCommand implements Command {

    private IMainBoard receiver;

    public OpenCommand(IMainBoard receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }
}
