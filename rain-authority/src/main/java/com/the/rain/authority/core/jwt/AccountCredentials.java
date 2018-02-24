package com.the.rain.authority.core.jwt;

import java.io.Serializable;

/**
 *
 * @author zengfeiyue
 */
public class AccountCredentials implements Serializable{
    private String username;
    private String password;

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
}
