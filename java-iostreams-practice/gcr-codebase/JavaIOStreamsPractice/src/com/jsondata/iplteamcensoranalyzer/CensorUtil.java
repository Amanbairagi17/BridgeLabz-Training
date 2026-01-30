package com.jsondata.iplteamcensoranalyzer;

public class CensorUtil {

    // Mumbai Indians -> Mumbai ***
    public static String maskTeam(String teamName) {
        String[] parts = teamName.split(" ");
        return parts[0] + " ***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}