package com.gmail.dmytronechkaliuk.homeworks.homework08;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortingAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = {45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};
        System.out.print("Please, enter array length: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];
        fillArrayWithRandomNumbers(numbers, 1, 100);

        System.out.println("Initial view of the array: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nSorted array: ");
        printArray(numbers);

        System.out.print("\nEnter the number to search for: ");
        int targetNumber = scanner.nextInt();

        int index = binarySearch(numbers, targetNumber);

        if (index == -1) {
            System.out.println("Number not found");
        } else {
            // System.out.println("Index of number " + targetNumber + " in the sorted array: " + index);
            System.out.printf("Index of number %d in the sorted array: %d", targetNumber, index);
        }

    }

    public static void fillArrayWithRandomNumbers(int[] numbers, int min, int max) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = temp;
        }
    }

    public static int binarySearch(int[] numbers, int targetNumber) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (targetNumber == middleNumber) {
                return middlePosition;
            }

            if (targetNumber < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }

        return -1;
    }

}