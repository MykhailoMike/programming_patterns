package main.java.com.mkaloshyn.behavioral.interpreter_15;

public class InterpreterRunner {

    public static void main(String[] args) {

        Expression isMono = getEngLangExpression();
        Expression isDuo = getDuoLangExpression();

        System.out.println("Does specialist know English: " + isMono.interpret("Pavlo Efimenko, 24 y,o,, English, Polish, experienced"));
        System.out.println("Does specialist know English and Deutsch: " + isDuo.interpret("Maria Pakhar, 22 y,o,, English, Deutsch, Bulgarian, experienced"));

    }

    public static Expression getEngLangExpression() {
        Expression english = new TerminalExpression("English");
        Expression businessEnglish = new TerminalExpression("Business English");
        return new OrExpression(english, businessEnglish);
    }

    public static Expression getDuoLangExpression() {
        Expression english = new TerminalExpression("English");
        Expression deutsch = new TerminalExpression("Deutsch");
        return new AndExpression(english, deutsch);
    }
}
