package com.gmail.dmytronechkaliuk.homeworks.homework07;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithArrays {
    public static void main(String[] args) {
        // int[] numbers = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};

        int[] numbers = new int[20];
        fillArrayWithRandomNumbers(numbers, -100, 100);

        System.out.println(Arrays.toString(numbers));

        sumNegativeNumbers(numbers);

        int evenNumbers = countEvenNumbers(numbers);
        System.out.println("Number of even numbers: " + evenNumbers);

        int oddNumbers = numbers.length - evenNumbers;
        System.out.println("Number of odd numbers: " + oddNumbers);

        minElement(numbers);
        maxElement(numbers);
        calculateAverage(numbers);
    }

    public static void fillArrayWithRandomNumbers(int[] numbers, int min, int max) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }

    public static void sumNegativeNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count += numbers[i];
            }

        }

        System.out.println("Sum of negative numbers: " + count);
    }

    public static int countEvenNumbers(int[] numbers) {
        int evenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }

        return evenNumbers;
    }

    public  static void minElement(int[] numbers) {
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

    public static void maxElement(int[] numbers) {
        int maxElement = 0;
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
                maxIndex = i;
            }

        }

        System.out.println("Largest element: " + maxElement + " (with index " + maxIndex + ")");
    }

    public static void calculateAverage(int[] numbers) {
        int firstNegativeNumber = findFirstNegativeIndex(numbers);

        if (firstNegativeNumber == -1) {
            System.out.println("No negative numbers found");
            return;
        } else if (firstNegativeNumber == numbers.length - 1) {
            System.out.println("No numbers after the first negative number");
            return;
        }

        int sum = 0;
        for (int i = firstNegativeNumber + 1; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int length = numbers.length - firstNegativeNumber - 1;
        double average = (double) sum / length;

        System.out.printf("Arithmetic mean of numbers after the first negative number: %.2f\n", average);
    }

    public static int findFirstNegativeIndex(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return i;
            }

        }

        return -1;
    }

}
