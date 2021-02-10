package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ListOfSuppliers {
    List<Supplier> listOfSuppliers = new ArrayList<>();
    public ListOfSuppliers() {
        listOfSuppliers.add(new ExtraFoodShop());
        listOfSuppliers.add(new GlutenFreeShop());
        listOfSuppliers.add(new HealthyShop());

    }
    public List<Supplier> getListOfSuppliers() {
        return listOfSuppliers;
    }

    public boolean addSupplier(Supplier supplier) {
        if (supplier!=null) {
            listOfSuppliers.add(supplier);
            return true;
        }
        return false;
    }


    //listOfSuppliers.

}
