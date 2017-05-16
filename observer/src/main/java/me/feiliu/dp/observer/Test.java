package me.feiliu.dp.observer;

import com.iluwatar.observer.WeatherType;

public class Test {

    public static void main(String[] args) throws Exception {
        Weather weather = new Weather();

        new XiaoQiang().subscribe(weather);
        new Zhangsan().subscribe(weather);

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    weather.weatherForecast(WeatherType.COLD);
                    break;
                case 1:
                    weather.weatherForecast(WeatherType.SUNNY);
                    break;
                case 2:
                    weather.weatherForecast(WeatherType.RAINY);
                    break;
                case 3:
                    weather.weatherForecast(WeatherType.WINDY);
                    break;
                default:
                    break;
            }
            Thread.sleep(500L);
        }
    }
}
