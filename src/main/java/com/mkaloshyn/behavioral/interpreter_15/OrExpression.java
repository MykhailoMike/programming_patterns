package main.java.com.mkaloshyn.behavioral.interpreter_15;

public class OrExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String description) {
        return expression1.interpret(description) || expression2.interpret(description);
    }
}
