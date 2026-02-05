package com.collectors.orderssum;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DriverClass {
	public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Aman", 250.50),
                new Order("Rahul", 300.00),
                new Order("Aman", 150.00),
                new Order("Rahul", 200.00),
                new Order("Sneha", 400.00)
        );

        Map<String, Double> revenueSummary =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                order -> order.getCustomerName(),
                                Collectors.summingDouble(order -> order.getAmount())
                        ));

        revenueSummary.forEach((customer, total) ->
                System.out.println(customer + " : " + total));
    }
}
