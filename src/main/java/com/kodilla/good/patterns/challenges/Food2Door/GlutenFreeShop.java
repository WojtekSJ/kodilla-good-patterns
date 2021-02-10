package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Supplier{
    @Override
    public boolean process(Product product, int amount) {
        if(amount>0) {
            System.out.println("Gluten Free Shop : ilosc " + amount);
            return true;
        }
        return false;
    }
}
