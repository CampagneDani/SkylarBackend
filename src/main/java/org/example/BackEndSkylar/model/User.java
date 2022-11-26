package org.example.BackEndSkylar.model;

import net.bytebuddy.implementation.bind.annotation.Default;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 * model of the users with attributes username, password, email and role
 * has getter/setter methods for every attribute
 */

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String role;


    public User(){}

    public User(Long id, String username, String password, String email,String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role =role;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString(){
        return "User{" +
                "id= "+ id +
                ", email= " + email +
                ", password= " + password +
                '}';
    }

}