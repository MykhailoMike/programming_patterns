package main.java.com.mkaloshyn.behavioral.visitor_23;

public interface Chef {

    void makeDish(Salad salad);

    void makeDish(MainDish mainDish);

    void makeDish(Dessert dessert);
}
