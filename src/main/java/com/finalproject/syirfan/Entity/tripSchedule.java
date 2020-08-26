package com.finalproject.syirfan.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tripSchedule")
public class tripSchedule {
    @Id
    @GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2",strategy = "uuid2")
    private String id;
    private String tripDate;
    private int availableSeats;
    private String tripDetail;
    @ElementCollection
    private Set<Long> tiketSold = new HashSet<>();;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTripDate() {
        return tripDate;
    }

    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getTripDetail() {
        return tripDetail;
    }

    public void setTripDetail(String tripDetail) {
        this.tripDetail = tripDetail;
    }

    public Set<Long> getTiketSold() {
        return tiketSold;
    }

    public void setTiketSold(Set<Long> tiketSold) {
        this.tiketSold = tiketSold;
    }

}
