package main.java.com.mkaloshyn.behavioral.chainOfResponsibility_13;

public class IntroTrainingStage extends TrainingStage {

    public IntroTrainingStage(int physicalStrength) {
        super(physicalStrength);
    }

    @Override
    public void doTraining(String clientName) {
        System.out.println(clientName + " is doing cardio excersices");
    }
}
