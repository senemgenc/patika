package org.example;

public abstract class GameManager {

    boolean start = false;

    public String open() {
        if (start) {
            return "Device is already running !";
        }
        start = true;
        return "Successful";
    }

    public String shutdown() {
        if (!start) {
            return "Device is already turned off !";
        }
        start = true;
        return "Successful";
    }

    public String playGame() {
        if (!start) {
            return "Device is already turned off !";
        }
        System.out.println("Oyun başladı.");
        return "Successful";
    }

}
