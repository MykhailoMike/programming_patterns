package main.java.com.mkaloshyn.behavioral.mediator_17;

public class MegaStoreRunner {

    public static void main(String[] args) {

        SellingSystem megaStoreInnerInfoSystem = new SellingSystem();

        Seller headOfSales = new HeadOfSales(megaStoreInnerInfoSystem, "Head");
        Seller seller01 = new SalesManager(megaStoreInnerInfoSystem, "Ivan");
        Seller seller02 = new SalesManager(megaStoreInnerInfoSystem, "Max");

        megaStoreInnerInfoSystem.setHeadOfSales(headOfSales);
        megaStoreInnerInfoSystem.addSeller(seller01);
        megaStoreInnerInfoSystem.addSeller(seller02);

        seller01.sellProduct(20);
        headOfSales.sellProduct(33);

    }
}
