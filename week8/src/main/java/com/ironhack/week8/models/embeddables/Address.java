package com.ironhack.week8.models.embeddables;

import jakarta.persistence.*;

@Embeddable
public class Address {
    private String streetAddress;
    private String city;
    private String postalCode;

    public Address(String streetAdress, String city, String postalCode) {
        this.streetAddress = streetAdress;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address() {

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
