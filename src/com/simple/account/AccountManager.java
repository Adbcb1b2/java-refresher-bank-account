package com.simple.account;

public class AccountManager {
    // Private field of BankAccount type
    private Account account;

    // Getter
    public Account getAccount() {
        return account;
    }

    // Setter
    public void setAccount(Account account) {
        this.account = account;
    }

    // Deposit method
    public void deposit(float amount){
        this.getAccount().deposit(amount);
    }

    // Withdraw method
    public void withdraw(float amount) throws InsufficientFundsException{
        this.getAccount().withdraw(amount);
    }


}
