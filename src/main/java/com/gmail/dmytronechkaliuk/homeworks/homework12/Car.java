package com.gmail.dmytronechkaliuk.homeworks.homework12;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car has started");
    }

    public void stop() {
        System.out.println("Car has stopped");
    }

    private void startElectricity() {
        System.out.println("Electricity started...");
    }

    private void startCommand() {
        System.out.println("Command started...");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started...");
    }

}
