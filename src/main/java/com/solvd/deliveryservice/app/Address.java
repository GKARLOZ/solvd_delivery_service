package com.solvd.deliveryservice.app;

public class Address {

    private String street;
    private String city;
    private  String county;
    private  String zipCode;
    private String state;

    public Address(){};
    public Address(String street, String city, String county, String zipCode, String state){

        this.state = state;
        this.city = city;
        this.street = street;
        this.county = county;
        this.zipCode = zipCode;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", zipCode=" + zipCode +
                ", state='" + state + '\'' +
                '}';
    }


}
