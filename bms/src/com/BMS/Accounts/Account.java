package com.BMS.Accounts;

import com.BMS.exceptions.InsufficientBalanceException;
public class Account {

    protected int accountNumber;
    protected double balance;
    protected static final double MIN_BALANCE = 1000;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {

        }

        if (balance - amount < MIN_BALANCE) {
            System.out.println("Cannot withdraw. Minimum balance must remain ₹1000");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
