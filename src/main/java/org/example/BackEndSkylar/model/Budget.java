package org.example.BackEndSkylar.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Budget implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Date startDate;
    private Date endDate;
    private Double value;
    private Boolean authorized;

    @JoinColumn(name = "assigned_Project_id")
    private Long assignedProjectId;


    public Budget(){}

    public Long getId() {
        return id;
    }

    public Budget(Long id, Date startDate, Date endDate, Double value, Boolean authorized, Long assignedProjectId) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.value = value;
        this.authorized = authorized;
        this.assignedProjectId = assignedProjectId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    public Long getAssignedProjectId() {
        return assignedProjectId;
    }

    public void setAssignedProjectId(Long assignedProjectId) {
        this.assignedProjectId = assignedProjectId;
    }
}
