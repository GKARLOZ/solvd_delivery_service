package com.solvd.deliveryservice.app;
import com.solvd.deliveryservice.exceptions.InvalidLicenseException;
import com.solvd.deliveryservice.interfaces.Loadable;
import com.solvd.deliveryservice.interfaces.Workable;

import java.util.Objects;

public class Driver extends Employee implements Workable, Loadable {

    private String licenseNumber;
    private Route deliveryRoute;
    private Route pickUpRoute;
    private Vehicle vehicle;

    public Driver(){};
    public Driver(String firstName, String lastName, String employeeId, String licenseNumber) {
        super(firstName, lastName, employeeId);
        this.licenseNumber = licenseNumber;

    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) throws InvalidLicenseException {
            if(licenseNumber.length() > 10 ) {
                throw new InvalidLicenseException("InvalidLicenseException: Not a valid license" );

            }else{this.licenseNumber = licenseNumber;}


    }

    public Route getDeliveryRoute() {
        return deliveryRoute;
    }

    public void setDeliveryRoute(Route deliveryRoute) {
        this.deliveryRoute = deliveryRoute;
    }

    public Route getPickUpRoute() {
        return pickUpRoute;
    }

    public void setPickUpRoute(Route pickUpRoute) {
        this.pickUpRoute = pickUpRoute;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Truck vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void loadPackages(PackageDoP[] packages) {}

    @Override
    public void unloadPackages(PackageDoP[] packages){};


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return Objects.equals(licenseNumber, driver.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), licenseNumber);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "licenseNumber='" + licenseNumber + '\'' +
                "} " + super.toString();
    }

}