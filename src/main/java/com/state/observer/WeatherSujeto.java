package com.state.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSujeto {
    private final List<WeatherObserver> observers = new ArrayList<>(); // Declaramos como un array porque su relacion es de uno a muchos
    private double temperature;


    public void suscribir(WeatherObserver observer){
        observers.add(observer);
    }

    public void desuscribir(WeatherObserver observer){
        observers.remove(observer);
    }

    public void setTemperature(double newTemperature){
        System.out.println("WeatherSujeto: Nueva temperatura: " + newTemperature);
        this.temperature = newTemperature;
        notificar();
    }

    public void notificar(){
        for(WeatherObserver observer : observers){
            observer.update(temperature);
        }
    }
}
