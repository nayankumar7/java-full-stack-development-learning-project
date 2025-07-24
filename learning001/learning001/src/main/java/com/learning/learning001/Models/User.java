package com.learning.learning001.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class User {
    private String name;
    private String email;
    private String password;

    public User(){

    }
    public User(String name, String email, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
