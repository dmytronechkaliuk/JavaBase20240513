package com.gmail.dmytronechkaliuk.homeworks.homework13;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
