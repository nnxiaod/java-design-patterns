package me.feiliu.dp.command.turnoncomputer;

/**
 * 来源：http://www.cnblogs.com/zxj159/p/3479154.html
 *
 * 测试
 */
public class Client {

    public static void main(String[] args) {
        //调用者：机箱
        ComputerMachineBox machineBox = new ComputerMachineBox();

        // 接收者：华硕主板
        IMainBoard receiver = new ASUSMainBoard();

        //创建开关机命令，设定它的接收者
        Command openCommand = new OpenCommand(receiver);
        Command closeCommand = new CloseCommand(receiver);

        // 华硕主板开关机
        machineBox.setOpenCommand(openCommand);
        machineBox.open();
        machineBox.setCloseCommand(closeCommand);
        machineBox.close();




    }
}
