package com.kodilla.good.patterns.challenges.Food2Door;

public class Service {
    public static void main(String[] args) {
        Product jablko = new Product("Jablko");
        Product gruszka = new Product("Gruszka");
        Product agawa = new Product("Agawa");
        Product soja = new Product("Soja");
        Product suchaKrakowska = new Product("Sucha Krakowska");
        Order purchaser = new Order();
        ListOfSuppliers supplierBase = new ListOfSuppliers();

        purchaser.makeOrder(supplierBase.getListOfSuppliers().get(0), gruszka, 2);
        purchaser.makeOrder(supplierBase.getListOfSuppliers().get(1), gruszka, 2);
        purchaser.makeOrder(supplierBase.getListOfSuppliers().get(2), suchaKrakowska, 3);
        purchaser.makeOrder(supplierBase.getListOfSuppliers().get(1), jablko, 11);
        purchaser.makeOrder(supplierBase.getListOfSuppliers().get(2), agawa, 56);

        Supplier kaufland = new Supplier() {
            @Override
            public boolean process(Product product, int amount) {
                System.out.println("Nowy dostawca Kaufland");
                return false;
            }
        };
        supplierBase.addSupplier(kaufland);
        purchaser.makeOrder(supplierBase.getListOfSuppliers().get(3), soja, 127);
    }
}
