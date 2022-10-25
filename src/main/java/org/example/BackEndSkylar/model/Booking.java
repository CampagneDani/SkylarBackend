package org.example.BackEndSkylar.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Date date;
    private Double value;

    @OneToOne
    @JoinColumn(name = "assigned_budget_id")
    private Budget assignedBudget;
    @OneToOne
    @JoinColumn(name = "assigned_user_id")
    private User assignedUser;

    @OneToOne
    @JoinColumn(name = "assigned_project_id")
    private Project assignedProject;
    @OneToOne
    @JoinColumn(name = "assigned_bank_account_id")
    private BankAccount assignedBankAccount;

    public Booking() {}

    public Booking(Long id, Date date, Double value, Budget assignedBudget, User assignedUser, Project assignedProject, BankAccount assignedBankAccount) {
        this.id = id;
        this.date = date;
        this.value = value;
        this.assignedBudget = assignedBudget;
        this.assignedUser = assignedUser;
        this.assignedProject = assignedProject;
        this.assignedBankAccount = assignedBankAccount;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
