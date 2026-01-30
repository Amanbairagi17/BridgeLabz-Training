package com.jsondata.iplteamcensoranalyzer;

public class IplCensorApp {

    public static void main(String[] args) {

        // JSON processing
        JsonProcessor.processJson(
                "src/jsonfiles/ipl_matches.json",
                "src/jsonfiles/ipl_matches_censored.json"
        );

        // CSV processing
        CsvProcessor.processCsv(
                "src/jsonfiles/ipl_matches.csv",
                "src/jsonfiles/ipl_matches_censored.csv"
        );
    }
}
