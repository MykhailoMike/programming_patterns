package main.java.com.mkaloshyn.behavioral.visitor_23;

public class ItalianChef implements Chef{

    String name;

    public ItalianChef(String name) {
        this.name = name;
    }

    @Override
    public void makeDish(Salad salad) {
        System.out.println("Chef " + name +" is making starter with tomatoes and mozzarella...");
    }

    @Override
    public void makeDish(MainDish mainDish) {
        System.out.println("Chef " + name + " is cooking main dish - ravioli...");
    }

    @Override
    public void makeDish(Dessert dessert) {
        System.out.println("Chef " + name + " is cooking dessert - panacota...");
    }
}
