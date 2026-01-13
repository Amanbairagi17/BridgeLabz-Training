package com.utilitybillpaymentsystem;

public class PayXpressApp {
    public static void main(String[] args) {

        Bill electricity = new ElectricalBill(1200, "10-02-2026");
        Bill water = new WaterBill(500, "12-02-2026");
        Bill internet = new InternetBill(999, "15-02-2026");

        electricity.sendReminder();
        water.sendReminder();
        internet.sendReminder();

        electricity.pay();
        internet.pay();
    }
}
