package org.example.BackEndSkylar.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Budget assignedBugdet;
    private User[] assigendUsers;
    private Booking[] assigendBookings;


    public Project(Budget assignedBugdet, User[] assigendUsers, Booking[] assigendBookings) {
        this.assignedBugdet = assignedBugdet;
        this.assigendUsers = assigendUsers;
        this.assigendBookings = assigendBookings;
    }

    public Budget getAssignedBugdet() {
        return assignedBugdet;
    }

    public void setAssignedBugdet(Budget assignedBugdet) {
        this.assignedBugdet = assignedBugdet;
    }

    public User[] getAssigendUsers() {
        return assigendUsers;
    }

    public void setAssigendUsers(User[] assigendUsers) {
        this.assigendUsers = assigendUsers;
    }

    public Booking[] getAssigendBookings() {
        return assigendBookings;
    }

    public void setAssigendBookings(Booking[] assigendBookings) {
        this.assigendBookings = assigendBookings;
    }
}
