package com.gmail.dmytronechkaliuk.homeworks.homework13;

public class PolymorphismPractice {
    public static void main(String[] args) {
        GeometricShape[] shapes = {
                new Circle(3),
                new Triangle(3, 4),
                new Square(5)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.println("The total area of all shapes: " + totalArea);
    }

    public static double calculateTotalArea(GeometricShape[] shapes) {
        double totalArea = 0;

        for (GeometricShape shape : shapes) {
            totalArea += shape.area();
        }

        return totalArea;
    }

}
