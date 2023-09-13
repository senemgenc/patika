package org.example;

public class SmartPhone extends Phone {
    public int smartPhoneId;
    public int ram;
    public int storage;
    public int camera;

    public SmartPhone(String name, Double price, String phoneNumber, int ram, int storage, int camera) {
        super(name, price, phoneNumber);
        this.ram = ram;
        this.storage = storage;
        this.camera = camera;
    }

    public SmartPhone() {
    }

    public int getSmartPhoneId() {
        return smartPhoneId;
    }

    public void setSmartPhoneId(int smartPhoneId) {
        this.smartPhoneId = smartPhoneId;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
