package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;
    private double grossPay;


    public Employee(int employeeId, String name, double hoursWorked, double payRate, double grossPay) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.grossPay = grossPay;
    }

    public double getgrossPay() {
        double grossP = hoursWorked * payRate;
        return grossPay;
    }

    public int getemployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }
}