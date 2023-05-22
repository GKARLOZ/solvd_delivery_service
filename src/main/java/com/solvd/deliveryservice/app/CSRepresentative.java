package com.solvd.deliveryservice.app;

import com.solvd.deliveryservice.interfaces.Workable;

import java.util.List;

public class CSRepresentative extends Employee implements Workable {

    private List<String> languages;
    private String communicationStyle;

    public CSRepresentative() {}

    public CSRepresentative(String firstName, String lastName, String birthDate, List<String> languages) {
        super(firstName, lastName, birthDate);
        this.languages = languages;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
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
}
