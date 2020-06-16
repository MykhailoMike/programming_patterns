package main.java.com.mkaloshyn.behavioral.visitor_23;

public class Dessert implements DinnerElement {
    @Override
    public void beMade(Chef chef) {
        chef.makeDish(this);
    }
}
