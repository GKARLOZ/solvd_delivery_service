package com.solvd.deliveryservice.app;

import com.solvd.deliveryservice.interfaces.Workable;
import com.solvd.deliveryservice.interfaces.Assignable;

public class Dispatcher extends Employee implements Workable, Assignable {

    private String dispatchStyle;
    private String communicationStyle;

    public Dispatcher(){};

    public Dispatcher(String firstName, String lastName, String birthDate, String dispatchStyle) {
        super(firstName, lastName, birthDate);
        this.dispatchStyle = dispatchStyle;
    }

    public String getDispatchStyle() {
        return dispatchStyle;
    }

    public void setDispatchStyle(String dispatchStyle) {
        this.dispatchStyle = dispatchStyle;
    }

    public String getCommunicationStyle() {
        return communicationStyle;
    }

    public void setCommunicationStyle(String communicationStyle) {
        this.communicationStyle = communicationStyle;
    }

    @Override
    public void clockIn() {

    }

    @Override
    public void startMorningWorkRoutine() {

    }

    @Override
    public void work() {

    }

    @Override
    public void clockOut() {

    }

    @Override
    public void assignRoute() {

    }

    @Override
    public void assignTask() {

    }

    @Override
    public String toString() {
        return "Dispatcher{" +
                "dispatchStyle='" + dispatchStyle + '\'' +
                "} " + super.toString();
    }

}
