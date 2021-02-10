package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Supplier{

    @Override
    public boolean process(Product product, int amount) {
        if(amount>0) {
            System.out.println("Ordered product: " + product.name + " w ilosci: " + amount);
            return true;
        }
        return false;
    }
}
