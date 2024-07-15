package com.gmail.dmytronechkaliuk.homeworks.homework05;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Income is taxed on a progressive scale of taxation:");
        System.out.println("\tfrom 0 to 10000, inclusive, at the rate of 2.5%.");
        System.out.println("\tfrom 10,000, exclusively, up to 25,000, inclusive, at a rate of 4.3%.");
        System.out.println("\tmore than 25,000, at a rate of 6.7%.");

        System.out.print("\nPlease, enter your income amount: $");
        double income = scanner.nextDouble();

        double tax = 0;
        if (income < 0) {
            System.out.println("Income cannot be negative!");
        } else {
            if (income <= 10000) {
                tax = income * 0.025;
            } else if (income <= 25000) {
                tax = 10000 * 0.025 + (income - 10000) * 0.043;
            } else {
                tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
            }

            System.out.printf("\nThe tax on income $%.2f is $%.2f", income, tax);
        }
    }
}
