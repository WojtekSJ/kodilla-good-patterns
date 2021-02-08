package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private Product orderedProduct;
    private PaymentOption paymentOption;
    private DeliveryOption deliveryOption;

    public OrderRequest(User user, LocalDateTime orderDate, Product orderedProduct, PaymentOption paymentOption, DeliveryOption deliveryOption) {
        this.user = user;
        this.orderDate = orderDate;
        this.orderedProduct = orderedProduct;
        this.paymentOption = paymentOption;
        this.deliveryOption = deliveryOption;
    }

    public PaymentOption getPaymentOption() {
        return paymentOption;
    }

    public DeliveryOption getDeliveryOption() {
        return deliveryOption;
    }

    public User getUser() { return user; }

    public LocalDateTime getOrderDate() { return orderDate; }

    public Product getOrderedProduct() { return orderedProduct; }
}
