package com.pluralsight;

public class CellPhone {
    private double serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    private String dial;

    public CellPhone(){

    }


    public CellPhone(double serialNumber, String model, String carrier, String phoneNumber, String owner, String dial) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.dial=dial;
    }

    public double getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDial() {
        return dial;
    }
    public void setDial(String dial){
        this.dial= dial;
    }
}