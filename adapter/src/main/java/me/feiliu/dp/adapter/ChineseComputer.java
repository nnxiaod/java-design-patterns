package me.feiliu.dp.adapter;

/**
 * 中国电脑
 */
public class ChineseComputer {
    private ChinaVoltage chinaVoltage;

    public ChineseComputer(ChinaVoltage chinaVoltage) {
        this.chinaVoltage = chinaVoltage;
    }

    public void turnOn() {
        chinaVoltage.powerUp();
    }
}
