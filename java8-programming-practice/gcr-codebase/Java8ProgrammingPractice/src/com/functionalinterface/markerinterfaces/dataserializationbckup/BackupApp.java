package com.functionalinterface.markerinterfaces.dataserializationbckup;

public class BackupApp {
    public static void main(String[] args) {

        UserData user = new UserData("Aman", "aman@gmail.com");
        TransactionData txn = new TransactionData(101, 5000);
        SessionData session = new SessionData("ABC123");

        BackupService.processBackup(user);
        BackupService.processBackup(txn);
        BackupService.processBackup(session);
    }
}
