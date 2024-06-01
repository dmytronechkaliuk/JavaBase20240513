package com.gmail.dmytronechkaliuk.bonus.task01;

public class UnluckyNumbers {
    public static void main(String[] args) {
        // System.out.println(hasFour(41));
        // System.out.println(hasNine(39));

        printShuttles();

    }

    public static boolean hasFour(int number) {
        while (number > 0) {
            if (number % 10 == 4) {

                return true;
            }

            number /= 10;
        }

        return  false;
    }

    public static boolean hasNine(int number) {
        while (number > 0) {
            if (number % 10 == 9) {

                return true;
            }

            number /= 10;
        }

        return false;
    }

    public static void printShuttles() {
        for (int i = 1; i <= 100; i ++) {
            if (hasFour(i) || hasNine(i)) {
                continue;
            }

            System.out.println("Space shuttle: " + i);
        }

    }

}
