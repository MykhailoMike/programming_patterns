package main.java.com.mkaloshyn.structural.decorator_09_2;

public class AdvancedCalculator extends CalculatorDecorator {

    public AdvancedCalculator(Calculator calculator) {
        super(calculator);
    }

    double doExtraAdditionalOperation(int a, int b, String action) {
        if (action.equalsIgnoreCase("pow") && b >= 1) {
            double res = a;
            for (int i = 1; i < b; i++) {
                res *= a;
            }
            return res;
        } else if (action.equalsIgnoreCase("pow") && b == 0) {
            return 1;
        } else {
            throw new RuntimeException("There is no such action supported by calculator");
        }
    }

    @Override
    public double calculate(int a, int b, String action) {
        try {
            return super.calculate(a, b, action);
        } catch (RuntimeException e) {
            return doExtraAdditionalOperation(a, b, action);
        }
    }
}
