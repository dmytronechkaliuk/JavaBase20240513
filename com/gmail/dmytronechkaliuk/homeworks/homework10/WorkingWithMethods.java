package com.gmail.dmytronechkaliuk.homeworks.homework10;

import java.util.Scanner;

public class WorkingWithMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        int square = calculateSquare(number);
        System.out.printf("The square of %d is %d", number, square);

        double radius = 3.5;
        double height = 10;
        double volume = calculateVolume(radius, height);
        System.out.printf("\nThe volume of a cylinder with a radius of %.1f and a height of %.1f is %f", radius, height, volume);

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = getSum(numbers);
        System.out.println("\nThe sum of all elements of the array is " + sum);

        String greeting = "Hello, World!";
        String reversedGreeting = reverseString(greeting);
        System.out.println("The string is in reverse order: " + reversedGreeting);

        System.out.print("Enter a base: ");
        int base = scanner.nextInt();
        System.out.print("Enter a power: ");
        int power = scanner.nextInt();
        int result = calculatePower(base, power);
        System.out.printf("The result of %d^%d is %d", base, power, result);

        System.out.print("\nEnter a count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a text string: ");
        String text = scanner.nextLine();
        String repeatedText = repeatText(count, text);
        System.out.println(repeatedText);
    }

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static String reverseString(String greeting) {
        String reversedString = "";
        for (int i = greeting.length() - 1; i > 0; i--) {
            reversedString += greeting.charAt(i);
        }

        return reversedString;
    }

    public static int calculatePower(int base, int power) {
        return (int) Math.pow(base, power);
    }

    public static String repeatText(int count, String text) {
        String repeatedText = "";
        for (int i = 0; i < count; i++) {
            repeatedText += text;

            if (i < count - 1) {
                repeatedText += "\n";
            }
        }

        return repeatedText;
    }

}
