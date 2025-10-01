package com.simple.account;

public class InsufficientFundsException extends Throwable {

    // Constructor
    public InsufficientFundsException(String message) {
        super(message);
    }
}
