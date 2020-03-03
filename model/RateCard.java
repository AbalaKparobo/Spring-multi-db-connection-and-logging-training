package com.logging.practice.model;

public class RateCard {

    private String fare;
    private String passenger;

    public RateCard() {
    }

    public RateCard(String fare, String passenger) {
        this.fare = fare;
        this.passenger = passenger;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }
}
