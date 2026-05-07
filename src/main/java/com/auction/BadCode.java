package com.auction;

public class BadCode {

    private int balance;

    public BadCode(int initialBalance) {
        this.balance = initialBalance;
    }

    public int deposit(int amount){
        System.out.println("amount: " + amount);
        int x=100;
        balance = balance + amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }
}