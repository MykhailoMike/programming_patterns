package main.java.com.mkaloshyn.behavioral.mediator_17;

import java.util.ArrayList;
import java.util.List;

public class SellingSystem implements Store {

    Seller headOfSales;
    List<Seller> salesForce = new ArrayList<>();

    public void setHeadOfSales(Seller headOfSales) {
        this.headOfSales = headOfSales;
    }

    public void addSeller(Seller seller) {
        salesForce.add(seller);
    }

    @Override
    public void sellProduct(int skuId, Seller seller) {
        for (Seller s : salesForce) {
            if (s != seller) {
                s.getWarehouseUpdate(skuId, seller);
            }
        }
        headOfSales.getWarehouseUpdate(skuId, seller);
    }
}

