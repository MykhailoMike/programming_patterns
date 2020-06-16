package main.java.com.mkaloshyn.structural.fasade_10;

public class Car {

    private Engine engine = new Engine();
    private GPSnavigator gps = new GPSnavigator();
    private AirConditioner ac = new AirConditioner();

    public void startCar() {
        engine.startEngine();
        ac.turnOnAC();
        gps.turnOn();
    }
}
