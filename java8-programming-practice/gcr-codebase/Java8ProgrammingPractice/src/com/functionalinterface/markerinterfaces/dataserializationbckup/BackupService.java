package com.functionalinterface.markerinterfaces.dataserializationbckup;

public class BackupService {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Backup not allowed for: " + obj.getClass().getSimpleName());
        }
    }
}
