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

    @JoinColumn(name = "assigned_budget_id")
    private Long assignedBudgetId;

    @JoinColumn(name = "assigned_project_id")
    private Long assignedProjectId;

    @JoinColumn(name = "assigned_bank_account_id")
    private Long assignedBankAccountId;

    public Booking() {}

    public Booking(Long id, Date date, Double value, Long assignedBudgetId, Long assignedProjectId, Long assignedBankAccountId) {
        this.id = id;
        this.date = date;
        this.value = value;
        this.assignedBudgetId = assignedBudgetId;
        this.assignedProjectId = assignedProjectId;
        this.assignedBankAccountId = assignedBankAccountId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getAssignedBudgetId() {
        return assignedBudgetId;
    }

    public void setAssignedBudgetId(Long assignedBudgetId) {
        this.assignedBudgetId = assignedBudgetId;
    }

    public Long getAssignedProjectId() {
        return assignedProjectId;
    }

    public void setAssignedProjectId(Long assignedProjectId) {
        this.assignedProjectId = assignedProjectId;
    }

    public Long getAssignedBankAccountId() {
        return assignedBankAccountId;
    }

    public void setAssignedBankAccountId(Long assignedBankAccountId) {
        this.assignedBankAccountId = assignedBankAccountId;
    }
}
