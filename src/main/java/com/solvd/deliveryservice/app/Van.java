package com.solvd.deliveryservice.app;

import com.solvd.deliveryservice.interfaces.Movable;

public class Van extends Vehicle implements Movable {


    private String id;
    private String lastMaintenance;
    private String nextMaintenance;
    private int mileage;

    public Van(){};

    public Van(String id, String lastMaintenance, String nextMaintenance, int mileage) {
        this.id = id;
        this.lastMaintenance = lastMaintenance;
        this.nextMaintenance = nextMaintenance;
        this.mileage = mileage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastMaintenance() {
        return lastMaintenance;
    }

    public void setLastMaintenance(String lastMaintenance) {
        this.lastMaintenance = lastMaintenance;
    }

    public String getNextMaintenance() {
        return nextMaintenance;
    }

    public void setNextMaintenance(String nextMaintenance) {
        this.nextMaintenance = nextMaintenance;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void moveforward() {

    }
}
