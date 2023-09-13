package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PhoneApp {
   public SmartPhone[] list = new SmartPhone[5];

    public PhoneApp() {
        SmartPhone phone1 = new SmartPhone("iphone", 16203.0, "56", 2, 250, 3);

        SmartPhone phone2 = new SmartPhone("Samsung", 18520.0, "48", 4, 500, 6);

        SmartPhone phone3 = new SmartPhone("Xioami", 19000.0, "22", 6, 500, 6);

        SmartPhone phone4 = new SmartPhone("Oppo", 20000.0, "22", 6, 500, 6);

        SmartPhone phone5 = new SmartPhone("Oppo", 20000.0, "22", 6, 500, 6);

        list[0] = phone1;
        list[1] = phone2;
        list[2] = phone3;
        list[3] = phone4;
        list[4] = phone5;
    }

    public Double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        Double totalPrice= (double) 0;
        for (SmartPhone smartPhone : smartPhoneArray) {
            totalPrice += smartPhone.getPrice();
        }
        return totalPrice;

    }


}
