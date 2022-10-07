package org.example.BackEndSkylar.model;

import java.util.Date;

public class Budget {

    private Date startDate;
    private Date endDate;
    private Double value;
    private Boolean authorized;


    public Budget(Date startDate, Date endDate, Double value, Boolean authorized) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.value = value;
        this.authorized = authorized;
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
}
