package org.example.BackEndSkylar.model;

/**
 * model of the login with attributes username and password
 * has getter/setter methods for every attribute
 */

public class Login {
    public String username;
    public String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
