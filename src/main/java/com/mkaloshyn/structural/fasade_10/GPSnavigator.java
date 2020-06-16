package main.java.com.mkaloshyn.structural.fasade_10;

public class GPSnavigator {

    boolean isTurnedOn;

    void turnOn() {
        System.out.println("GPS navigator is being turned on");
        isTurnedOn = true;
        defineCurrentPoint();
    }

    void defineCurrentPoint() {
        if (isTurnedOn) {
            System.out.println("GPS navigator is defining current place coordinates.");
        }
    }

    void turnOff() {
        System.out.println("GPS navigator is being turned off");
        isTurnedOn = false;
    }
}
