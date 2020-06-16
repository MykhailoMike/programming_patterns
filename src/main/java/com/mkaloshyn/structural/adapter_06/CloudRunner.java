package main.java.com.mkaloshyn.structural.adapter_06;

public class CloudRunner {

    public static void main(String[] args) {
        Cloud cloud = new AdapterCabinetToCloud();
        cloud.download();
        cloud.upload();
    }
}
