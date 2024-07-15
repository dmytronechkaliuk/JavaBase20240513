package com.gmail.dmytronechkaliuk.homeworks.homework06;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;

            // System.out.println(i + ") Num is " + i + ", sum is " + sum);
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
        }

        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
