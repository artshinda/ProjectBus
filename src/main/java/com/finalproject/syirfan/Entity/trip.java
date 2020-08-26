package com.finalproject.syirfan.Entity;

import javax.validation.constraints.NotBlank;

public class trip {
    @NotBlank
    private long id;
    @NotBlank
    private int fare;
    @NotBlank
    private String journeyTime;
    @NotBlank
    private long sourceStop;
    @NotBlank
    private long destStop;
    @NotBlank
    private long bus;
    @NotBlank
    private long agency;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(String journeyTime) {
        this.journeyTime = journeyTime;
    }

    public long getSourceStop() {
        return sourceStop;
    }

    public void setSourceStop(long sourceStop) {
        this.sourceStop = sourceStop;
    }

    public long getDestStop() {
        return destStop;
    }

    public void setDestStop(long destStop) {
        this.destStop = destStop;
    }

    public long getBus() {
        return bus;
    }

    public void setBus(long bus) {
        this.bus = bus;
    }

    public long getAgency() {
        return agency;
    }

    public void setAgency(long agency) {
        this.agency = agency;
    }

}
