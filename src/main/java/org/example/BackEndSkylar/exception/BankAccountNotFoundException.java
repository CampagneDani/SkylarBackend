package org.example.BackEndSkylar.exception;

public class BankAccountNotFoundException extends RuntimeException {
    public BankAccountNotFoundException(String message){
        super(message);
    }
}
