package com.solvd.deliveryservice.app;

import java.util.List;

public class DeliveryService{

    private String name;
    private List<Hub> hubs;
    public DeliveryService(){};

    public DeliveryService(String name, List<Hub> hubs) {
        this.name = name;
        this.hubs = hubs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hub> getHubs() {
        return hubs;
    }

    public void setHubs(List<Hub> hubs) {
        this.hubs = hubs;
    }

    @Override
    public String toString() {
        return "DeliveryService{" +
                "name='" + name + '\'' +
                ", hubs=" + hubs +
                '}';
    }
}
