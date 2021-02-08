package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderService {

    public boolean order(User user, LocalDateTime orderDate, Product orderedProduct,
                         PaymentOption paymentOption, DeliveryOption deliveryOption){
        if (new PerformPayment().process(paymentOption.getPaymentChosen())) {
            System.out.println("Payment confirmed");
            return true;
        }
        System.out.println("Payment not performed. Order cancelled");
        return false;
    }
}
