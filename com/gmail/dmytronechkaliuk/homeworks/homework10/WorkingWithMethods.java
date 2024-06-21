package com.gmail.dmytronechkaliuk.homeworks.homework10;

import java.util.Scanner;

public class WorkingWithMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int square = square(number);
        System.out.printf("The square of %d is %d", number, square);

        double radius = 3.5;
        double height = 10;
        double volume = volume(radius, height);
        System.out.printf("\nThe volume of a cylinder with a radius of %.1f and a height of %.1f is %f", radius, height, volume);

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = getSum(numbers);
        System.out.println("\nThe sum of all elements of the array is " + sum);

        System.out.print("Enter a string: ");
        String message = scanner.nextLine();
        String reversedMessage = reverse(message);
        System.out.println("The string is in reverse order: " + reversedMessage);

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
        String repeatedText = repeat(text, count);
        System.out.println(repeatedText);
    }

    public static int square(int number) {
        return number * number;
    }

    public static double volume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static String reverse(String message) {
        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        return reversed;
    }

    public static int calculatePower(int base, int power) {
        return (int) Math.pow(base, power);
    }

    public static String repeat(String text, int count) {
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
