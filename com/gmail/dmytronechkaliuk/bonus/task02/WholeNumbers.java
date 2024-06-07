package com.gmail.dmytronechkaliuk.bonus.task02;

import java.util.Scanner;

public class WholeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("\nEnter a second number: ");
        int secondNumber = scanner.nextInt();

        whileLoop(firstNumber, secondNumber);
        doWhileLoop(firstNumber, secondNumber);
        forLoop(firstNumber, secondNumber);
    }

    public static int getSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void whileLoop(int firstNumber, int secondNumber) {
        int count = 0;
        while (firstNumber < secondNumber) {
            if (firstNumber % getSum(firstNumber) == 0) {
                count++;
            }

            firstNumber++;
        }

        System.out.println("Count (while loop): " + count);
    }

    public static void doWhileLoop(int firstNumber, int secondNumber) {
        int count = 0;
        do {
            if (firstNumber % getSum(firstNumber) == 0) {
                count++;
            }

            firstNumber++;
        } while (firstNumber < secondNumber);

        System.out.println("Count (do while loop): " + count);
    }

    public static void forLoop(int firstNumber, int secondNumber) {
        int count = 0;
        for (int i = firstNumber; i < secondNumber; i++) {
            if (i % getSum(i) == 0) {
                count++;
            }
        }

        System.out.println("Count (for loop): " + count);
    }

}
