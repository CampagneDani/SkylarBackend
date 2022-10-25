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


    public BankAccount(){}

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
