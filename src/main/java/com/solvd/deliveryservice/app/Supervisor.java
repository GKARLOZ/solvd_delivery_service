package com.solvd.deliveryservice.app;

public class Supervisor extends Employee {

    private  String supervisionStyle;
    private  String communicationStyle;
    private  String supervisorLevel;

    public Supervisor(){};
    public Supervisor(String firstName, String lastName, String birthdate, String supervisionStyle, String communicaitonStyle, String supervisorLevel) {
        super(firstName, lastName, birthdate);
        this.supervisionStyle = supervisionStyle;
        this.communicationStyle = communicaitonStyle;
        this.supervisorLevel = supervisorLevel;
    }

    public String getSupervisionStyle() {
        return supervisionStyle;
    }

    public void setSupervisionStyle(String supervisionStyle) {
        this.supervisionStyle = supervisionStyle;
    }

    public String getCommunicationStyle() {
        return communicationStyle;
    }

    public void setCommunicationStyle(String communicationStyle) {
        this.communicationStyle = communicationStyle;
    }

    public String getSupervisorLevel() {
        return supervisorLevel;
    }

    public void setSupervisorLevel(String supervisorLevel) {
        this.supervisorLevel = supervisorLevel;
    }


    @Override
    public String toString() {
        return "Supervisor{" +
                super.toString();
    }
}
