package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Supplier{
    @Override
    public boolean process(Product product, int amount) {
        if(amount>0) {
            System.out.println("Dostawca Healty Shop zamowienie: " + product.name );
            return true;
        }
        return false;
    }
}
