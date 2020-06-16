package main.java.com.mkaloshyn.behavioral.visitor_23;

public class MainDish implements DinnerElement {
    @Override
    public void beMade(Chef chef) {
        chef.makeDish(this);
    }
}
