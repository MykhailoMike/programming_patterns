package main.java.com.mkaloshyn.behavioral.interpreter_15;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String description) {
        return description.contains(data);
    }
}
