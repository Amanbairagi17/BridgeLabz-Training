package com.streamapi.stockpricelogger;

import java.util.Arrays;
import java.util.List;

public class StockLogger {

    public static void main(String[] args) {

        List<Stock> liveFeed = Arrays.asList(
                new Stock("TCS", 3850.50),
                new Stock("Infosys", 1520.75),
                new Stock("Reliance", 2905.40),
                new Stock("HDFC Bank", 1688.20)
        );

        // Logging stock prices
        liveFeed.stream()
                .forEach(stock ->
                        System.out.println(stock.getName() + " -> ₹" + stock.getPrice())
                );
    }
}
