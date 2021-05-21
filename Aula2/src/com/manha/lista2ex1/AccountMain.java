package com.manha.lista2ex1;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account(0, "Rodrigo");
        Account account2 = new Account(10000, "Heller");

        account1.deposit(1000);
        account1.withdraw(300);
        account2.transfer(account1,5000);
        account2.refund(200);

        System.out.println("Balance 1: " + account1.getBalance());
        System.out.println("Balance 2: " + account2.getBalance());
    }
}
