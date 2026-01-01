package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class DriverClass {
	public static void main(String[] args) {
		// creating object
        DeliveredOrder d1 = new DeliveredOrder(0, "01-01-2026", "01", "14-01-2026");
        DeliveredOrder d2 = new DeliveredOrder(1, "12-12-2025", "02", "14-01-2026");

        System.out.println("ID: " + d1.orderId + " Order Date: " + d1.orderDate + " Tracking Number: " + d1.trackingNumber + " Delivery Date: " + d1.deliveryDate + " Status: " + d1.getOrderStatus());
        System.out.println("ID: " + d2.orderId + " Order Date: " + d2.orderDate + " Tracking Number: " + d2.trackingNumber + " Delivery Date: " + d2.deliveryDate + " Status: " + d2.getOrderStatus());

    }
}
