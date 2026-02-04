package com.functionalinterface.markerinterfaces.dataserializationbckup;

public class UserData implements BackupSerializable {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
}
