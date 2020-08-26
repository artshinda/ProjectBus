package com.finalproject.syirfan.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="bus")
public class bus {
    @NotBlank
    private String code;
    @NotBlank
    private int capacity;
    @NotBlank
    private String make;
    @NotBlank
    private long agency;

    @NotBlank
    private long id;

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public long getAgency() {
        return agency;
    }

    public void setAgency(long agency) {
        this.agency = agency;
    }
}
