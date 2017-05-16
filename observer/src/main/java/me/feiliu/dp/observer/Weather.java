package me.feiliu.dp.observer;

import com.iluwatar.observer.WeatherType;

import java.util.Observable;
import java.util.Observer;

public class Weather extends Observable {

    public void weatherForecast(WeatherType weatherType) {
        System.out.println("订阅数：" + countObservers());
        System.out.println("weather forecast : " + weatherType);
        notifyObservers(weatherType);
        setChanged();
    }

}
