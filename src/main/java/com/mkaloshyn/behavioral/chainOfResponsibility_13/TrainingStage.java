package main.java.com.mkaloshyn.behavioral.chainOfResponsibility_13;

public abstract class TrainingStage {

    private int physicalStrength;
    private TrainingStage nextTrainingStage;

    public TrainingStage(int physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    public void setNextTrainingStage(TrainingStage trainingStage) {
        nextTrainingStage = trainingStage;
    }

    public void moveOn(String clientName, int physicalStrength) {
        if (physicalStrength>= this.physicalStrength) {
            doTraining(clientName);
        }
        if (nextTrainingStage!=null) {
            nextTrainingStage.moveOn(clientName, physicalStrength);
        }
    }

    public abstract void doTraining(String clientName);
}

