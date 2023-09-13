package org.example;

public class Main {
    public static void main(String[] args) {

        PhoneApp phoneApp = new PhoneApp();
        System.out.println("Toplam Tutar:" + phoneApp.calculateTotalPrice(phoneApp.list));
    }


}