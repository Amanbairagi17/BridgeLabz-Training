package com.regex.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealTracker {

    private static final Pattern CODE_PATTERN =
            Pattern.compile("DealCode:\\s*(\\w+)");

    private static final Pattern DATE_PATTERN =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");

    private static final Pattern DISCOUNT_PATTERN =
            Pattern.compile("Discount:\\s*(\\d+)%");

    private static final Pattern MIN_PATTERN =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {

        File file = new File("src/com/regex/source/deals.txt");

        Map<String, Deal> validDeals = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();
        List<Deal> sortedDeals = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(file)) {

            String content = new String(fis.readAllBytes());

            String[] blocks = content.split("\\n\\s*\\n");

            for (String block : blocks) {

                try {

                    String code = extract(block, CODE_PATTERN);
                    String dateStr = extract(block, DATE_PATTERN);
                    String discountStr = extract(block, DISCOUNT_PATTERN);
                    String minStr = extract(block, MIN_PATTERN);

                    if (dealCodes.contains(code))
                        continue;

                    LocalDate validTill =
                            LocalDate.parse(dateStr, FORMATTER);

                    if (validTill.isBefore(LocalDate.now()))
                        continue;

                    int discount = Integer.parseInt(discountStr);
                    int minPurchase = Integer.parseInt(minStr);

                    Deal deal = new Deal(
                            code, discount, validTill, minPurchase);

                    validDeals.put(code, deal);
                    dealCodes.add(code);
                    sortedDeals.add(deal);

                } catch (Exception e) {
                    System.out.println("Invalid deal skipped\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // sort by discount descending
        sortedDeals.sort(
                Comparator.comparingInt(Deal::getDiscount).reversed()
        );

        System.out.println("VALID DEALS");
        sortedDeals.forEach(System.out::println);
    }

    private static String extract(String text, Pattern pattern) {

        Matcher matcher = pattern.matcher(text);

        if (matcher.find())
            return matcher.group(1);

        throw new RuntimeException("Missing field");
    }
}
