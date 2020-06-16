package main.java.com.mkaloshyn.behavioral.visitor_23;

public class FrenchChef implements Chef {

    String name;

    public FrenchChef(String name) {
        this.name = name;
    }

    @Override
    public void makeDish(Salad salad) {
        System.out.println("Chef " + name +" is making hot salad with beef...");
    }

    @Override
    public void makeDish(MainDish mainDish) {
        System.out.println("Chef " + name + " is cooking main dish - onion soup...");
    }

    @Override
    public void makeDish(Dessert dessert) {
        System.out.println("Chef " + name + " is making dessert - chocolate souffle...");
    }
}
