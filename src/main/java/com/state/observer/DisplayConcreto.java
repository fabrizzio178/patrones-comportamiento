package com.state.observer;

public class DisplayConcreto implements WeatherObserver {
    private final String name;

    public DisplayConcreto(String name){
        this.name = name;
    }

    @Override
    public void update(double temperature){
        System.out.println("Display " + name + ": La temperatura actual es: " + temperature);
    }
}
