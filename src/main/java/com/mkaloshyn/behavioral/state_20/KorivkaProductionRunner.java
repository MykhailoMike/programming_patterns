package main.java.com.mkaloshyn.behavioral.state_20;

public class KorivkaProductionRunner {

    public static void main(String[] args) {
        KorivkaFudgeProduction korivkaFudgeProduction = new KorivkaFudgeProduction();
        PreparingLine preparingLine = new PreparingLine();
        korivkaFudgeProduction.setAction(preparingLine);

        for (int i=1; i <= 15; i++) {
            korivkaFudgeProduction.executeStage();
            korivkaFudgeProduction.changeProductionStage();
            if (i%5==0) {
                System.out.println("=============================================");
            }
        }
    }
}
