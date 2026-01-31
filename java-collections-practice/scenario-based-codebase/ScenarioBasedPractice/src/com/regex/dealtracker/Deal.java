package com.regex.dealtracker;

import java.time.LocalDate;

public class Deal extends Promotion<Integer> {

    private LocalDate validTill;
    private int minPurchase;

    public Deal(String dealCode,
                int discountPercent,
                LocalDate validTill,
                int minPurchase) {

        super(dealCode, discountPercent);
        this.validTill = validTill;
        this.minPurchase = minPurchase;
    }

    public int getDiscount() {
        return benefit;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public int getMinPurchase() {
        return minPurchase;
    }

    @Override
    public String toString() {
        return "DealCode=" + dealCode +
                ", Discount=" + benefit + "%" +
                ", ValidTill=" + validTill +
                ", MinPurchase=" + minPurchase;
    }
}
