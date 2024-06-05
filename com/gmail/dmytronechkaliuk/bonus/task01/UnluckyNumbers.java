package com.gmail.dmytronechkaliuk.bonus.task01;

public class UnluckyNumbers {
    public static void main(String[] args) {

        printShuttles();
    }

    public static boolean hasDigit(int number, int digit) {
        while (number > 0 ) {
            if  (number % 10 == digit) {

                return true;
            }

            number /= 10;
        }

        return false;
    }

    public static void printShuttles() {
        int index = 0;
        for (int luckyNumber = 1; luckyNumber <= 100; luckyNumber ++) {
            if (hasDigit(luckyNumber, 4) || hasDigit(luckyNumber, 9)) {

                continue;
            }
            index++;

            System.out.printf("\nShuttle %d has number: %d", index, luckyNumber);
        }

    }

}
