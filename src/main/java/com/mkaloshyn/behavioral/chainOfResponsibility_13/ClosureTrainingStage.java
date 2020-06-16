package main.java.com.mkaloshyn.behavioral.chainOfResponsibility_13;

public class ClosureTrainingStage extends TrainingStage {

    public ClosureTrainingStage(int physicalStrength) {
        super(physicalStrength);
    }

    @Override
    public void doTraining(String clientName) {
        System.out.println(clientName + " is doing stretching");
    }
}






