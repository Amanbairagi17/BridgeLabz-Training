package com.regex.smarthospitalinventorytracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class MedInventoryApp {

    private static final String DATE_REGEX =
            "\\d{2}-\\d{2}-\\d{4}";

    private static final int CRITICAL_LIMIT = 20;

    public static void main(String[] args) {

        String fileName = "src/com/regex/source/inventory.csv";

        Set<Item<?>> uniqueItems = new HashSet<>();
        Map<String, List<Item<?>>> categoryMap = new HashMap<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                try {

                    String[] data = line.split(",");

                    if (data.length != 4)
                        continue;

                    String id = data[0];
                    String name = data[1];
                    int qty = Integer.parseInt(data[2]);
                    String expiry = data[3];

                    // Regex validation
                    if (!expiry.matches(DATE_REGEX))
                        continue;

                    MedicalItem item =
                            new MedicalItem(
                                    id,
                                    name,
                                    qty,
                                    expiry,
                                    name.toLowerCase()
                            );

                    // remove duplicates
                    uniqueItems.add(item);

                    // critical stock check
                    if (qty < CRITICAL_LIMIT)
                        throw new LowStockException(
                                name + " stock critically low: " + qty);

                } catch (LowStockException e) {
                    System.out.println("⚠ ALERT: " + e.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Categorize items
        for (Item<?> item : uniqueItems) {

            categoryMap
                    .computeIfAbsent(
                            item.getCategory().toString(),
                            k -> new ArrayList<>())
                    .add(item);
        }

        // Expired items
        System.out.println("\n EXPIRED ITEMS ");

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate today = LocalDate.now();

        for (Item<?> item : uniqueItems) {

            LocalDate exp =
                    LocalDate.parse(
                            item.getExpiryDate(), formatter);

            if (exp.isBefore(today))
                System.out.println(item);
        }

        // Display category wise
        System.out.println("\n CATEGORY WISE INVENTORY ");

        categoryMap.forEach((cat, list) -> {
            System.out.println("\n" + cat.toUpperCase());
            list.forEach(System.out::println);
        });
    }
}
