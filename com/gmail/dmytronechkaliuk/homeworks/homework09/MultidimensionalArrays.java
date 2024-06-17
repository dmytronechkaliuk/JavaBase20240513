package com.gmail.dmytronechkaliuk.homeworks.homework09;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        int[][] matrix = {
                {23, 45, 12, 37},
                {50, 11, 42, 20},
                {33, 27, 19, 48},
                {8, 39, 6, 4}
        };
         */

        // System.out.println("Matrix 4x4: ");
        // printMatrix(matrix);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        fillMatrixWithRandomNumbers(matrix, 1, 50);

        System.out.printf("Matrix %dx%d:\n", rows, columns);
        printMatrix(matrix);

        /*
        int[][] matrix = {
                { 67, 1, 43 },
                { 13, 37, 61 },
                { 31, 73, 7 }
        };
         */

        // System.out.println("Matrix 3x3: ");
        // printMatrix(matrix);

        int sumEvenRows = sumRows(matrix, 0);
        int sumOddRows = sumRows(matrix, 1);

        System.out.println("Sum of elements in even rows: " + sumEvenRows);
        System.out.println("Sum of elements in odd rows: " + sumOddRows);

        long productEvenColumns = productColumns(matrix, 0);
        long productOddColumns = productColumns(matrix, 1);

        System.out.println("Product of elements in even columns: " + productEvenColumns);
        System.out.println("Product of elements in odd columns: " + productOddColumns);

        if (isMagicSquare(matrix)) {
            System.out.println("\nGiven matrix is a Magic Square");
        } else {
            System.out.println("\nGiven matrix is not a Magic Square");
        }
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

    public static int sumRows(int[][] matrix, int initial) {
        int sum = 0;
        for (int i = initial; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static long productColumns(int[][] matrix, int initial) {
        long product = 1L;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = initial; j < matrix[i].length; j += 2) {
                product *= matrix[i][j];
            }
        }

        return product;
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            firstDiagonalSum += matrix[i][i];
            secondDiagonalSum += matrix[i][matrix.length - 1 - i];
        }

        if (firstDiagonalSum != secondDiagonalSum) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int columnSum = 0;

            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }

            if (rowSum != columnSum || columnSum != firstDiagonalSum) {
                return false;
            }
        }

        return true;
    }

}
