package com.ironhack.week8.models;

import com.ironhack.week8.models.embeddables.*;
import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String lastName;
    @Embedded
    private Address address;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetAddress", column = @Column(name = "perm_street_address")),
            @AttributeOverride(name = "city", column = @Column(name = "perm_city")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "perm_postal_code"))
    })
    private Address invoicingAddress;

    public Customer(String firstName, String lastName, Address address, Address invoicingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.invoicingAddress = invoicingAddress;
    }

    public Customer() {

    }

    public Long getCustomerId() {
        return customerId;
    }

    public Address getInvoicingAddress() {
        return invoicingAddress;
    }

    public void setInvoicingAddress(Address invoicingAddress) {
        this.invoicingAddress = invoicingAddress;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
