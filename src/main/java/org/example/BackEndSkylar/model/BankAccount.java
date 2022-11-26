package org.example.BackEndSkylar.model;

import javax.persistence.*;

/**
 * model of the bank accounts with attributes saldo and bankAccountName
 * has getter/setter methods for every attribute
 */

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Double saldo;

    private String bankAccountName;

    @JoinColumn(name ="assigned_user_id")
    private Long assignedUserId;


    public BankAccount(){}

    public BankAccount(Long id, Double saldo, String bankAccountName, Long assignedUserId) {
        this.id = id;
        this.saldo = saldo;
        this.bankAccountName = bankAccountName;
        this.assignedUserId = assignedUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public Long getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(Long assignedUserId) {
        this.assignedUserId = assignedUserId;
    }
}
