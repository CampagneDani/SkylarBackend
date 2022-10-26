package org.example.BackEndSkylar.model;

import javax.persistence.*;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Double saldo;

    @ManyToOne
    @JoinColumn(name= "assigned_Bookings_id")
    private Booking[] assigendBookings;

    @ManyToOne
    @JoinColumn(name= "assigned_Users_id")
    private User[] assignedUsers;

    public BankAccount(Long id, Double saldo, Booking[] assigendBookings, User[] assignedUsers) {
        this.id = id;
        this.saldo = saldo;
        this.assigendBookings = assigendBookings;
        this.assignedUsers = assignedUsers;
    }

    public BankAccount(){}

    public Booking[] getAssigendBookings() {
        return assigendBookings;
    }

    public void setAssigendBookings(Booking[] assigendBookings) {
        this.assigendBookings = assigendBookings;
    }

    public User[] getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(User[] assignedUsers) {
        this.assignedUsers = assignedUsers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BankAccount(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
