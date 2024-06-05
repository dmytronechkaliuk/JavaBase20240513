package com.gmail.dmytronechkaliuk.homeworks.homework07;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithArrays {
    public static void main(String[] args) {
        // int[] numbers = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};

        int[] numbers = new int[20];
        fillArrayWithRandomNumbers(numbers, -100, 100);

        System.out.println(Arrays.toString(numbers));

        SumOfNegativeNumbers(numbers);
        NumberOfEvenNumbers(numbers);
        NumberOfOddNumbers(numbers);
        SmallestElement(numbers);
        LargestElement(numbers);
        ArithmeticMean(numbers);
    }

    public static void fillArrayWithRandomNumbers(int[] numbers, int min, int max) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }

    public static void SumOfNegativeNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count += numbers[i];
            }

        }

        System.out.println("Sum of negative numbers: " + count);
    }

    public static void NumberOfEvenNumbers(int[] numbers) {
        int evenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }

        }

        System.out.println("Number of even numbers " + evenNumbers);
    }

    public static void NumberOfOddNumbers(int[] numbers) {
        int oddNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers++;
            }

        }

        System.out.println("Number of odd numbers: " + oddNumbers);
    }

    public  static void SmallestElement(int[] numbers) {
        int minElement = 0;
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minElement) {
                minElement = numbers[i];
                minIndex = i;
            }

        }

        System.out.println("Smallest element: " + minElement + " (with index " + minIndex + ")");
    }

    public static void LargestElement(int[] numbers) {
        int maxElement = 0;
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
                maxIndex = i;
            }

        }

        System.out.println("Smallest element: " + maxElement + " (with index " + maxIndex + ")");
    }

    public static void ArithmeticMean(int[] numbers) {
        int firstNegativeNumber = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeNumber = i;
                break;
            }

        }

        if (firstNegativeNumber == -1) {
            System.out.println("No negative numbers found");
            return;
        }

        int sum = 0;
        int length = 0;
        for (int i = firstNegativeNumber + 1; i < numbers.length; i++) {
            sum += numbers[i];
            length++;
        }

        if (length == 0) {
            System.out.println("No numbers after the first negative number");
            return;
        }

        double average = (double) sum / length;

        System.out.printf("Arithmetic mean of numbers after the first negative number: %.2f\n", average);
    }

}
