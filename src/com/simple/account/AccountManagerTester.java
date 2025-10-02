package com.simple.account;


public class AccountManagerTester {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        BusinessAccount account = new BusinessAccount(1000, 1, "SimpleCorp", "123 Fake Street");

        // Initlaise the manager object with the bank account object as defined in the constructor
        manager.setAccount(account);

        // Use the manager to deposit 400
        manager.deposit(400f);
        try{
            manager.withdraw(20f);
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        //
        System.out.println("Managing " + manager.getAccount());

    }
}
