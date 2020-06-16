package main.java.com.mkaloshyn.behavioral.chainOfResponsibility_13;

public class LiftingTrainingStage extends TrainingStage {

    public LiftingTrainingStage(int physicalStrength) {
        super(physicalStrength);
    }

    @Override
    public void doTraining(String clientName) {
        System.out.println(clientName + " is lifting weights");
    }
}
