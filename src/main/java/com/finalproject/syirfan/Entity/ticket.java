package com.finalproject.syirfan.Entity;

import javax.validation.constraints.NotBlank;

public class ticket {
    @NotBlank
    private int seatNumber;
    @NotBlank
    private Boolean cancellable;
    @NotBlank
    private String journeyDate;
    @NotBlank
    private long passenger;
    @NotBlank
    private long tripSchedule;

    @NotBlank
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Boolean getCancellable() {
        return cancellable;
    }

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public long getPassenger() {
        return passenger;
    }

    public void setPassenger(long passenger) {
        this.passenger = passenger;
    }

    public long getTripSchedule() {
        return tripSchedule;
    }

    public void setTripSchedule(long tripSchedule) {
        this.tripSchedule = tripSchedule;
    }


}
