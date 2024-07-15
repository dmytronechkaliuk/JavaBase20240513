package com.gmail.dmytronechkaliuk.homeworks.homework16;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return  firstNumber - secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("You can't divide by zero");
        }

        return firstNumber / secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

}
