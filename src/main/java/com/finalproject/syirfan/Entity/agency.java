package com.finalproject.syirfan.Entity;

import javax.validation.constraints.NotBlank;

public class agency {
    @NotBlank
    private long id;
    @NotBlank
    private String code;
    @NotBlank
    private String name;
    @NotBlank
    private String details;
    @NotBlank
    private long owner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }
}
