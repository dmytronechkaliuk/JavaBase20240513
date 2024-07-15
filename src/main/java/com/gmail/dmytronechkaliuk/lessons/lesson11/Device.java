package com.gmail.dmytronechkaliuk.lessons.lesson11;

public class Device {
    String imei;
    int year;

    public Device() {
        imei = "default";
        year = 2024;
    }

    public Device(String imei, int year) {
        this.imei = imei;
        this.year = year;
    }

    public void describe() {
        System.out.printf("I'm a device with [imei = %s, year = %d]\n", imei, year);
    }
}
