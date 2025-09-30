package com.simple.test;

import com.simple.account.BankAccount;

public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1, "Kim Richards", 100f);
        account.deposit(50f);
        System.out.println("A Bank Account");
        System.out.println("ID: " + account.getAccountID());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Owner: " + account.getOwnerName());

        BankAccount account2 = new BankAccount(2, "Steve Shilling", 5000f);
        BankAccount.setInterestRate(5.5f);
        BankAccount account3 = new BankAccount(3, "Bob Richards", 999.99f);

        System.out.println("account 2 is owned by" + account2.getOwnerName());
        System.out.println("account 3 is owned by" + account3.getOwnerName());

        account2.deposit(100f);
        account3.deposit(50f);

        System.out.println("account 2 interest rate is: " + BankAccount.getInterestRate());
        System.out.println("account 3 interest rate is: " + BankAccount.getInterestRate());
    }
}