package com.gmail.dmytronechkaliuk.lessons.lesson12.subpackage;

import com.gmail.dmytronechkaliuk.lessons.lesson12.BankAccount;

public class HackerAccount {

    private BankAccount account;

    public HackerAccount(BankAccount account) {
        this.account = account;
    }

    public void hack() {
        int money = account.getMoney();
        account.setMoney(-money);
    }

}
