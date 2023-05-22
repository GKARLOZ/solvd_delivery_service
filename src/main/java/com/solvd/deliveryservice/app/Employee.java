package com.solvd.deliveryservice.app;

public abstract class Employee extends Person {

    private String id;
    private double salary;
    private String bankAccount;

    public Employee(){}

    public Employee(String firstName, String lastName,String birthDate) {
        super(firstName,lastName, birthDate);
    }
    public Employee(String firstName, String lastName,String birthDate, String employeeId, int salary, String bankAccount) {
        super(firstName,lastName, birthDate);
        this.id = employeeId;
        this.salary = salary;
        this.bankAccount = bankAccount;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + id + '\'' +
                ", salary=" + salary +
                ", bankAccount='" + bankAccount + '\'' +
                "} " + super.toString();
    }


}
