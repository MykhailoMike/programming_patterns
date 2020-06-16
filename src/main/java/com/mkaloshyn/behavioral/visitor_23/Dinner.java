package main.java.com.mkaloshyn.behavioral.visitor_23;

public class Dinner implements DinnerElement {

    DinnerElement[] elements;

    public Dinner() {
        this.elements = new DinnerElement[]{
                new Salad(),
                new MainDish(),
                new Dessert()
        };
    }

    @Override
    public void beMade(Chef chef) {
        for (DinnerElement element : elements) {
            element.beMade(chef);
        }
    }
}
