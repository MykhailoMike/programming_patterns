package main.java.com.mkaloshyn.behavioral.state_20;

public class KorivkaFudgeProduction {

    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeProductionStage() {
        if (action instanceof PreparingLine) {
            setAction(new PuttingStarchOnTheForms());
        } else if (action instanceof PuttingStarchOnTheForms) {
            setAction(new PouringCaramelToTheForms());
        } else if (action instanceof PouringCaramelToTheForms) {
            setAction(new ChillingForms());
        } else if (action instanceof ChillingForms) {
            setAction(new MovingOutReadyFudge());
        } else if (action instanceof MovingOutReadyFudge) {
            setAction(new PreparingLine());
        }
    }

    public void executeStage() {
        action.executeStage();
    }
}
