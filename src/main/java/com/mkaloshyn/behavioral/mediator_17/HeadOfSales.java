package main.java.com.mkaloshyn.behavioral.mediator_17;

public class HeadOfSales implements Seller {

    Store store;
    String name;

    public HeadOfSales(Store store, String name) {
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
        System.out.println("Head of sales has been informed on selling sku with id=" + skuId + " by " + seller);
    }

    @Override
    public void sellProduct(int skuId) {
        store.sellProduct(skuId, this);
    }

    @Override
    public String toString() {
        return "Head of Sales";
    }
}
