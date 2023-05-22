package com.solvd.deliveryservice.app;


import com.solvd.deliveryservice.exceptions.InvalidAmountException;
import com.solvd.deliveryservice.exceptions.InvalidFuelTypeException;
import com.solvd.deliveryservice.exceptions.InvalidIDException;
import com.solvd.deliveryservice.interfaces.Movable;
import com.solvd.deliveryservice.interfaces.Securable;
//import com.solvd.exceptions.*;
//import com.solvd.interfaces.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Truck extends Vehicle implements Securable, Movable {

    private final static Logger LOGGER = LogManager.getLogger(Truck.class);
    private String id;
    private String lastMaintenance;
    private String nextMaintenance;
    private int mileage;
    public Truck(){};
    public Truck(String id, String lastMaintenance, String nextMaintenance, int mileage) {
        this.id = id;
        this.lastMaintenance = lastMaintenance;
        this.nextMaintenance = nextMaintenance;
        this.mileage = mileage;
    }
    public String getId() {return id;}

    public void setId(String id) {

        try {
            if (id.isEmpty() || id == null) {
                throw new InvalidIDException("InvalidIDException: Can't use this ID.");
            }
            else{LOGGER.info("Id is set.");}

        }
        catch (InvalidIDException e) {

            LOGGER.error(e.getMessage());

        }

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

        try {
            if (mileage > 999999 || mileage == 0) {
                throw new InvalidAmountException("InvalidAmountException: Invalid amount.");
            } else {
                this.mileage = mileage;
            }
        }catch (InvalidAmountException e) {
            LOGGER.error(e.getMessage());


        }
    }


    public void refuel(String fuel){
        try {
            if (fuel != "Diesel"|| fuel.isEmpty()) {

                throw new InvalidFuelTypeException("InvalidFuelTypeException: Wrong Fuel Type");
            } else {
                LOGGER.info("Refueling with Diesel.");
            }
        }catch (InvalidFuelTypeException e) {

            LOGGER.error(e.getMessage());

        }
    }


    @Override
    public void turnOffLights() {

    }

    @Override
    public void lockDoors() {

    }

    @Override
    public void activateAlarms() {

    }

    @Override
    public void turnLeft() {
        LOGGER.info(" turning left. ");
    }

    @Override
    public void turnRight() {

    }

    @Override
    public void moveforward() {

    }

}
