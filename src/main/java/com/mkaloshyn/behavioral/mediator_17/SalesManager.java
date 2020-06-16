package main.java.com.mkaloshyn.behavioral.mediator_17;

public class SalesManager implements Seller {

    Store store;
    String name;

    public SalesManager(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getWarehouseUpdate(int skuId, Seller seller) {
        System.out.println("Seller " + this.name + " has been informed on selling sku with id=" + skuId + " by " + seller);
    }

    @Override
    public void sellProduct(int skuId) {
        store.sellProduct(skuId, this);
    }

    @Override
    public String toString() {
        return "sales manager " + name;
    }
}
