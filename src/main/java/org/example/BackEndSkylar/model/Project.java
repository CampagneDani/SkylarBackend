package org.example.BackEndSkylar.model;

public class Project {

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
