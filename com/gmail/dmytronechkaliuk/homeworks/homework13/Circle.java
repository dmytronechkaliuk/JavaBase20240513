package com.gmail.dmytronechkaliuk.homeworks.homework13;

public class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
