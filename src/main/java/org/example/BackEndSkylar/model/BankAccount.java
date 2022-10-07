package org.example.BackEndSkylar.model;

public class BankAccount {

    private Double saldo;


    public BankAccount(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
