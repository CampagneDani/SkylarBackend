package org.example.BackEndSkylar.model;

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
    private User[] assignedUsers;

    @ManyToOne
    @JoinColumn(name = "assigned_Bookings_id")
    private Booking[] assignedBookings;


    public Project() {
    }

    public Project(Budget assignedBugdet, User[] assignedUsers, Booking[] assignedBookings) {
        this.assignedBugdet = assignedBugdet;
        this.assignedUsers = assignedUsers;
        this.assignedBookings = assignedBookings;
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

    public User[] getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(User[] assigendUsers) {
        this.assignedUsers = assigendUsers;
    }

    public Booking[] getAssignedBookings() {
        return assignedBookings;
    }

    public void setAssignedBookings(Booking[] assigendBookings) {
        this.assignedBookings = assigendBookings;
    }
}
