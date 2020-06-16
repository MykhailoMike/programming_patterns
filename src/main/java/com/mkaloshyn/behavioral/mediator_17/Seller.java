package main.java.com.mkaloshyn.behavioral.mediator_17;

public interface Seller {
    void getWarehouseUpdate(int skuId, Seller seller);
    void sellProduct(int skuId);
}
