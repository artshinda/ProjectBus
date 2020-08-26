package com.finalproject.syirfan.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="trip")
public class trip {
    @Id
    @GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2",strategy = "uuid2")
    private String id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
