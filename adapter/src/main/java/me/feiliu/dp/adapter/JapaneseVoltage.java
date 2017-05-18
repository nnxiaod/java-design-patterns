package me.feiliu.dp.adapter;

/**
 * 日本电压
 */
public class JapaneseVoltage implements ForeignVoltage {

    @Override
    public void powerUp() {
        System.out.println("日本电压供电...");
    }
}
