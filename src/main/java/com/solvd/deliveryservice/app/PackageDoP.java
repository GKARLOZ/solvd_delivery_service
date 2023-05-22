package com.solvd.deliveryservice.app;

import java.util.Objects;

public class PackageDoP{

    private Address destination;
    private Customer customer;
    private String type;
    private double weightLB;
    private String id;
    public PackageDoP(){};

    public PackageDoP(Address address, Customer customer, String packageType, double weigthLB, String id) {
        this.destination = address;
        this.customer = customer;
        this.type = packageType;
        this.weightLB = weigthLB;
        this.id = id;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightLB() {
        return weightLB;
    }

    public void setWeightLB(double weightLB) {
        this.weightLB = weightLB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageDoP that = (PackageDoP) o;
        return Objects.equals(destination, that.destination) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, id);
    }

    @Override
    public String toString() {
        return "PackageDoP{" +
                "address=" + destination +
                ", customer=" + customer +
                ", packageType='" + type + '\'' +
                ", weigthLB=" + weightLB +
                ", id='" + id + '\'' +
                '}';
    }
}
