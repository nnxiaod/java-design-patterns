package me.feiliu.dp.command.general;

/**
 * 调用者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
