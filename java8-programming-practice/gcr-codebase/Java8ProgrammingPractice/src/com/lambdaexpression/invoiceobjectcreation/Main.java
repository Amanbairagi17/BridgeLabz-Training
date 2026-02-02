package com.lambdaexpression.invoiceobjectcreation;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> transactionIds = List.of(
            1001, 1002, 1003, 1004, 1005
        );

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)   // constructor reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
