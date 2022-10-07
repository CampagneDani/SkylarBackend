package org.example.BackEndSkylar.model;

import java.sql.Date;

public class Booking {

    private Date date;
    private Double value;
    private Budget assignedBudget;
    private User assignedUser;
    private Project assignedProject;
    private BankAccount assignedBankAccount;


    public Booking(Date date, Double value, Budget assignedBudget, User assignedUser, Project assignedProject, BankAccount assignedBankAccount) {
        this.date = date;
        this.value = value;
        this.assignedBudget = assignedBudget;
        this.assignedUser = assignedUser;
        this.assignedProject = assignedProject;
        this.assignedBankAccount = assignedBankAccount;
    }

    public BankAccount getAssignedBankAccount() {
        return assignedBankAccount;
    }

    public void setAssignedBankAccount(BankAccount assignedBankAccount) {
        this.assignedBankAccount = assignedBankAccount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Budget getAssignedBudget() {
        return assignedBudget;
    }

    public void setAssignedBudget(Budget assignedBudget) {
        this.assignedBudget = assignedBudget;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Project getAssignedProject() {
        return assignedProject;
    }

    public void setAssignedProject(Project assignedProject) {
        this.assignedProject = assignedProject;
    }
}
