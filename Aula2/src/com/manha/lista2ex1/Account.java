package com.manha.lista2ex1;

public class Account {
    private double balance;
    private String owner;

    public Account(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public Account(Account account) {
        this.balance = account.getBalance();
        this.owner = account.getOwner();

    }

    public Account() { }

    public void deposit(double value) {
        this.balance += value;
    }

    public double withdraw(double value) {
        if (value > balance) return 0;

        this.balance -= value;
        return value;
    }

    public void refund(double value) {
        this.balance += value;
    }

    public void transfer(Account receiver, double value) {
        if (value > balance) return;

        this.balance -= value;
        receiver.setBalance(receiver.getBalance() + value);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }
}
