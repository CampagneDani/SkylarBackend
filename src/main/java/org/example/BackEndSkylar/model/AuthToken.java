package org.example.BackEndSkylar.model;

/**
 * Used for the authentication of users
 */

public class AuthToken {
    public String username;
    public String password;
    public String role;

    public AuthToken(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
