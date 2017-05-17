package me.feiliu.dp.command.turnoncomputer;

/**
 * 具体命令，关机
 */
public class CloseCommand implements Command {

    private IMainBoard receiver;

    public CloseCommand(IMainBoard receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }
}
