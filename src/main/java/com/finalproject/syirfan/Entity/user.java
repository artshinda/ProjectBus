package com.finalproject.syirfan.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private int mobileNumber;
    @NotBlank
    private int roles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getRoles() {
        return roles;
    }

    public void setRoles(int roles) {
        this.roles = roles;
    }
}
