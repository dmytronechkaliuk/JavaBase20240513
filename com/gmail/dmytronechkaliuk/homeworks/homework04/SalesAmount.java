package com.gmail.dmytronechkaliuk.homeworks.homework04;

public class SalesAmount {
    public static void main(String[] args) {
        int order = 1;
        String product = "smartphone";
        int days = 5;
        double price = 12153.41;

        System.out.printf("Product No %d: %s,\n", order, product);
        System.out.printf("total sales for %d is EUR %.2f,\n", days, price);
        System.out.printf("sales by day is EUR %.2f.\n", (price / days));

        order = 2;
        product = "laptop";
        days = 7;
        price = 10486.85;

        System.out.printf("Product No %d: %s,\n", order, product);
        System.out.printf("total sales for %d is EUR %.2f,\n", days, price);
        System.out.printf("sales by day is EUR %.2f.\n", (price / days));
    }
}
