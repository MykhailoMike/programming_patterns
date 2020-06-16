package main.java.com.mkaloshyn.behavioral.chainOfResponsibility_13;

public class TrainingPlanner {

    public static void main(String[] args) {

        IntroTrainingStage introTrainingStage = new IntroTrainingStage(PhysicalStrength.LOW);
        LiftingTrainingStage liftingTrainingStage = new LiftingTrainingStage(PhysicalStrength.HIGH);
        ClosureTrainingStage closureTrainingStage = new ClosureTrainingStage(PhysicalStrength.MIDDLE);

        introTrainingStage.setNextTrainingStage(liftingTrainingStage);
        liftingTrainingStage.setNextTrainingStage(closureTrainingStage);

        introTrainingStage.moveOn("Max Lion", PhysicalStrength.MIDDLE);
        System.out.println();
        introTrainingStage.moveOn("Ada Orwell", PhysicalStrength.HIGH);
        System.out.println();
        introTrainingStage.moveOn("Lorain Smith", PhysicalStrength.LOW);
    }
}
