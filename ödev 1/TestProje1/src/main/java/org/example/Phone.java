package org.example;

public class Phone extends Product {
    public int phoneId;
    public String phoneNumber;

    public Phone() {
    }

    public Phone(String name, Double price, String phoneNumber) {
        super(name, price);
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
