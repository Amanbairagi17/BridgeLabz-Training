package com.patientmanagementsystem;

public class DriverClass {
    public static void main(String[] args) {

        // Doctor
        Doctor doctor = new Doctor(101, "Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        System.out.println("-------------------------");

        // In-Patient
        InPatient inPatient = new InPatient(1, "Rohan", 5, 3000);
        inPatient.displayInfo();

        double roomCharges = inPatient.calculateRoomCharges();
        double discount = HospitalUtil.calculateDiscount(roomCharges);

        Bill inPatientBill = new Bill(roomCharges, 0.18, discount);
        System.out.println("Total Bill: " + inPatientBill.calculatePayment());

        System.out.println("-------------------------");

        // Out-Patient
        OutPatient outPatient = new OutPatient(2, "Aman", 800);
        outPatient.displayInfo();

        Bill outPatientBill = new Bill(outPatient.getConsultationFee(), 0.18, 0);
        System.out.println("Total Bill: " + outPatientBill.calculatePayment());

        System.out.println("-------------------------");

        // Polymorphism
        Patient p;
        p = inPatient;
        p.displayInfo();

        p = outPatient;
        p.displayInfo();
    }

}
