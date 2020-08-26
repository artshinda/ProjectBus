package com.finalproject.syirfan.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name="tripSchedule")
public class tripSchedule {
    @Id
    @GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2",strategy = "uuid2")
    @NotBlank
    private String id;
    @NotBlank
    private String tripDate;
    @NotBlank
    private int availableSeats;
    @NotBlank
    private long tripDetail;
    @NotBlank
    private Set<Long> tiketSold;

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

    public long getTripDetail() {
        return tripDetail;
    }

    public void setTripDetail(long tripDetail) {
        this.tripDetail = tripDetail;
    }

    public Set<Long> getTiketSold() {
        return tiketSold;
    }

    public void setTiketSold(Set<Long> tiketSold) {
        this.tiketSold = tiketSold;
    }

}
