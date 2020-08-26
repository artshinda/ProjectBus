package com.finalproject.syirfan.Entity;

import javax.validation.constraints.NotBlank;

public class role {
    @NotBlank
    private long id;
    @NotBlank
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
