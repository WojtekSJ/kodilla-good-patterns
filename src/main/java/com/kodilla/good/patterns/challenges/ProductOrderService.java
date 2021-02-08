package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService {
    public static void main(String[] args) {


        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new OrderService(), new OrderRepository());
        OrderDto order1 =  orderProcessor.process(orderRequest);

        System.out.println("\nFirst order user: " + order1.getUser().getName());
        System.out.println("First order product name: " + orderRequest.getOrderedProduct().getName() + "\n");

        Product product2 = new Product("Laptop", "Electronics", 4500.4, 1, "Lenovo 666");
        OrderRequest orderRequest2 = orderRequestRetriever.create(new User("Wojciech", "Szala"), LocalDateTime.of(2021, 2, 1, 12, 0),
        product2, new PaymentOption(1), new DeliveryOption(1));
        OrderDto order2 = orderProcessor.process(orderRequest2);
        System.out.println("\nSecond order user: " + order2.getUser().getName());
        System.out.println("Second order product name: " + orderRequest2.getOrderedProduct().getName());


    }
}
