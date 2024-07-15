package com.gmail.dmytronechkaliuk.bonus.task03;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 4, 1, 5, 9, 8, 6, 3};

        System.out.println("Before sorting: ");
        printArray(numbers);

        System.out.println("\nSorted array: ");
        bubbleSort(numbers);
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
