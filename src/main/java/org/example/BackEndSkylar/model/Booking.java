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
    private Long assigned_budget_id;

    @JoinColumn(name = "assigned_project_id")
    private Long assigned_project_id;

    @JoinColumn(name = "assigned_bank_account_id")
    private Long assigned_bank_account_id;

    public Booking() {}

    public Booking(Long id, Date date, Double value, Long assigned_budget_id, Long assigned_project_id, Long assigned_bank_account_id) {
        this.id = id;
        this.date = date;
        this.value = value;
        this.assigned_budget_id = assigned_budget_id;
        this.assigned_project_id = assigned_project_id;
        this.assigned_bank_account_id = assigned_bank_account_id;
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

    public Long getAssigned_budget_id() {
        return assigned_budget_id;
    }

    public void setAssigned_budget_id(Long assigned_budget_id) {
        this.assigned_budget_id = assigned_budget_id;
    }

    public Long getAssigned_project_id() {
        return assigned_project_id;
    }

    public void setAssigned_project_id(Long assigned_project_id) {
        this.assigned_project_id = assigned_project_id;
    }

    public Long getAssigned_bank_account_id() {
        return assigned_bank_account_id;
    }

    public void setAssigned_bank_account_id(Long assigned_bank_account_id) {
        this.assigned_bank_account_id = assigned_bank_account_id;
    }
}
