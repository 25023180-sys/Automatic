package com.auction;

/**
 * Class representing a simple bank account with basic operations.
 * This class is made final to satisfy Checkstyle's DesignForExtension rule.
 */
public final class BadCode {

    /** The current balance of the account. */
    private int balance;

    /** The magic number for demo purposes. */
    private static final int MAGIC_HUNDRED = 100;

    /**
     * Constructs a new BadCode instance with an initial balance.
     *
     * @param initialBalance the starting balance of the account
     */
    public BadCode(final int initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Deposits an amount into the account.
     *
     * @param amount the amount to deposit
     * @return the new balance
     */
    public int deposit(final int amount) {
        System.out.println("amount: " + amount);
        int x = MAGIC_HUNDRED;
        balance = balance + amount;
        return balance;
    }

    /**
     * Withdraws an amount from the account.
     *
     * @param amount the amount to withdraw
     * @return the new balance
     */
    public int withdraw(final int amount) {
        balance = balance - amount;
        return balance;
    }

    /**
     * Gets the current balance.
     *
     * @return the current balance
     */
    public int getBalance() {
        return balance;
    }
}