package org.example.BackEndSkylar.model;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "assigned_bugdet_id")
    private Budget assignedBugdet;

    @ManyToOne
    @JoinColumn(name = "assigend_user_id")
    private User[] assigendUsers;

    @ManyToOne
    @JoinColumn(name = "assigned_Booking_id")
    private Booking[] assigendBookings;


    public Project() {
    }

    public Project(Budget assignedBugdet, User[] assigendUsers, Booking[] assigendBookings) {
        this.assignedBugdet = assignedBugdet;
        this.assigendUsers = assigendUsers;
        this.assigendBookings = assigendBookings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
