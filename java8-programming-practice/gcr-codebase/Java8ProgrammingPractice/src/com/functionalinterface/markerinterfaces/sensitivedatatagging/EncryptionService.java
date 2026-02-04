package com.functionalinterface.markerinterfaces.sensitivedatatagging;

public class EncryptionService {

    public static void encryptIfSensitive(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting data for: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption required for: " + obj.getClass().getSimpleName());
        }
    }
}
