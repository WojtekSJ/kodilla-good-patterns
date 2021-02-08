package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Dexter", "Morgan");
        Product orderedProduct = new Product("Kapcie", "Artykuly domowe", 12.4, 1, "Cieple i suche");
        LocalDateTime orderDate = LocalDateTime.of(2021, 2, 1, 12, 0);
        PaymentOption paymentOption = new PaymentOption(2);
        DeliveryOption deliveryOption = new DeliveryOption(1);

        return new OrderRequest(user, orderDate, orderedProduct, paymentOption, deliveryOption);
    }

    public OrderRequest create(User user, LocalDateTime orderDate, Product orderedProduct,
    PaymentOption paymentOption, DeliveryOption deliveryOption) {
        return new OrderRequest(user, orderDate, orderedProduct, paymentOption, deliveryOption);
    }
}
