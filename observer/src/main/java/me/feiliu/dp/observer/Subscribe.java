package me.feiliu.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscribe implements Observer {

    public void subscribe(Weather weather) {
        weather.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.toString() + " knows the weather will be " + arg);
    }

    @Override
    public String toString() {
        return "Subscriber ";
    }
}
