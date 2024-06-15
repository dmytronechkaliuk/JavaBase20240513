package com.gmail.dmytronechkaliuk.homeworks.homework09;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {23, 45, 12, 37},
                {50, 11, 42, 20},
                {33, 27, 19, 48},
                {8, 39, 6, 4}
        };

        System.out.println("Matrix 4x4: ");
        printMatrix(matrix);

        // System.out.print("Enter the number of rows: ");
        // int rows = scanner.nextInt();

        // System.out.print("Enter the number of columns: ");
        // int columns = scanner.nextInt();

        // int[][] matrix = new int[rows][columns];
        // fillMatrixWithRandomNumbers(matrix, 1, 50);

        // System.out.printf("Matrix %dx%d:\n", rows, columns);
        // printMatrix(matrix);

        int sumEvenRows = sumEvenRows(matrix);
        int sumOddRows = sumOddRows(matrix);

        System.out.println("Sum of elements in even rows: " + sumEvenRows);
        System.out.println("Sum of elements in odd rows: " + sumOddRows);

        long productEvenColumns = productEvenColumns(matrix);
        long productOddColumns = productOddColumns(matrix);

        System.out.println("Product of elements in even columns: " + productEvenColumns);
        System.out.println("Product of elements in odd columns: " + productOddColumns);
    }

    public static void fillMatrixWithRandomNumbers(int[][] matrix, int min, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(min, max + 1);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int sumEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static int sumOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static long productEvenColumns(int[][] matrix) {
        long product = 1L;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 0) {
                    product *= matrix[i][j];
                }
            }
        }

        return product;
    }

    public static long productOddColumns(int[][] matrix) {
        long product = 1L;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 != 0) {
                    product *= matrix[i][j];
                }
            }
        }

        return product;
    }

}
