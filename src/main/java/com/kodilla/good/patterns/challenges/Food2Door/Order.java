package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {
    public void makeOrder(Supplier supplier, Product product, int amount) {
        supplier.process(product,amount);
    }
}
