package main.java.com.mkaloshyn.behavioral.visitor_23;

public class RestaurantRunner {

    public static void main(String[] args) {
        Dinner dinner = new Dinner();
        Chef frenchChef = new FrenchChef("Luis Maison");
        Chef italianChef = new ItalianChef("Marco Truzzi");
        dinner.beMade(frenchChef);
        System.out.println("=========================================");
        dinner.beMade(italianChef);
    }
}
