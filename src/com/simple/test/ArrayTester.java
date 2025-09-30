package com.simple.test;

import com.simple.account.BankAccount;
import com.simple.account.SavingsAccount;

public class ArrayTester {
    public static void main(String[] args) {
        // accounts points to an array of 4 BankAccounts
        BankAccount[] accounts = new BankAccount[4];

        accounts[0] = new SavingsAccount(1, "Jeff Leb", 100f);
        accounts[1] = new BankAccount(2, "Kim Richards", 5000);
        accounts[2] = new BankAccount(3, "Jeb Johnsons", 1f);

        BankAccount first = accounts[0];
        System.out.println("First account has ID: " + first.getAccountID());

        BankAccount second = accounts[1];
        System.out.println("Second account is owned by " + second.getOwnerName());




    }
}
