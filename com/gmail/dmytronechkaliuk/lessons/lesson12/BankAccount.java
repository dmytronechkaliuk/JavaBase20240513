package com.gmail.dmytronechkaliuk.lessons.lesson12;

public class BankAccount {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int delta) {
        if (money + delta < 0) {
            return;
        }

        money += delta;
    }

}