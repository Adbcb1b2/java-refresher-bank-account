package com.simple.account;

public class BankAccount {
    private int accountID;
    private String ownerName;
    private float balance;
    private static float interestRate;

    public BankAccount(int accountID, String ownerName, float balance){
        super(); // Call to the superclass's constructor
        this.accountID = accountID;
        this.ownerName = ownerName;
        setBalance(balance); // Use method because there is validation logic
    }

    public static float getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(float interestRate){
        BankAccount.interestRate = interestRate;
    }

    public void deposit(float amount){
        balance = balance + amount;
    }

    public void setAccountID(int newID){
        this.accountID = newID;
    }

    public int getAccountID(){
        return this.accountID;
    }

    public void setOwnerName(String newName){
        this.ownerName = newName;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        // If the balance is bigger than 0, set it
        if(balance > 0f){
            this.balance = balance;
        // If the balance is not bigger than 0, print error
        }else{
            System.out.println("Error. Balance cannot be a negative.");
        }
    }
}
