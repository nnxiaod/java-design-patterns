package me.feiliu.dp.adapter;

/**
 * 电压适配器
 */
public class VoltageAdapter implements ChinaVoltage {

    private ForeignVoltage foreignVoltage;

    public VoltageAdapter(ForeignVoltage foreignVoltage) {
        this.foreignVoltage = foreignVoltage;
    }

    public void setForeignVoltage(ForeignVoltage foreignVoltage) {
        this.foreignVoltage = foreignVoltage;
    }

    @Override
    public void powerUp() {
        foreignVoltage.powerUp();
    }
}
