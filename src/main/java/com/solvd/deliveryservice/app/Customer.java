package com.solvd.deliveryservice.app;

import java.util.Objects;

public class Customer extends Person {

    private String id;
    private String membershipLevel;
    private int loyaltyPoints;
    private String preferredLanguage;
    public Customer(){};

    public Customer(String firstName, String lastName, String birthDate, String id) {
        super(firstName, lastName, birthDate);
        this.id = id;
    }
    public String getID() {
        return id;
    }

    public void setID(String customerID) {
        this.id = id;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

}
