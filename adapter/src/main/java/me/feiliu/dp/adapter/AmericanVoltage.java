package me.feiliu.dp.adapter;

/**
 * 美国电压
 */
public class AmericanVoltage implements ForeignVoltage {

    @Override
    public void powerUp() {
        System.out.println("美国电压供电...");
    }
}
