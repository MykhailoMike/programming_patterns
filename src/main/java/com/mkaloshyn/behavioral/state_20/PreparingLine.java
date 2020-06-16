package main.java.com.mkaloshyn.behavioral.state_20;

public class PreparingLine implements Action {
    @Override
    public void executeStage() {
        System.out.println("Production line preparation for the start of production cycle...");
    }
}
