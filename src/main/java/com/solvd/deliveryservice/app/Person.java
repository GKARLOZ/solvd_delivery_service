package com.solvd.deliveryservice.app;

import com.solvd.deliveryservice.exceptions.InvalidNameException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Person{

    private final static Logger LOGGER = LogManager.getLogger(Person.class);
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Address address;
    public Person(){};
    public Person( String firstName, String lastName, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        try {
            if (firstName.length() > 20 || firstName.isEmpty()) {

                throw new InvalidNameException("InvalidNameException: Name can't exceed of 20 characters");

            } else {
                this.firstName = firstName;
            }
        }catch (InvalidNameException e) {

            LOGGER.error(e.getMessage());
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() { return address;}

    public void setAddress(Address address) { this.address = address; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return dateOfBirth == person.dateOfBirth && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + dateOfBirth +
                '}';
    }

}
