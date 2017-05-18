package me.feiliu.dp.adapter;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new AmericanVoltage());
        ChineseComputer chineseComputer = new ChineseComputer(voltageAdapter);
        chineseComputer.turnOn();

        voltageAdapter.setForeignVoltage(new JapaneseVoltage());
        chineseComputer.turnOn();
    }
}
