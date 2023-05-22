package com.solvd.deliveryservice.app;

import java.util.List;

public class Hub{

    private Address address;
    private String name;
    private List<Employee> employees;
    public Hub(){};
    public Hub(Address address, String name) {
        this.address = address;
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Hub{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
