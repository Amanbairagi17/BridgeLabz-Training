package com.jsondata.iplteamcensoranalyzer;

import java.io.*;

public class CsvProcessor {

    public static void processCsv(String input, String output) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output));

            String header = br.readLine();
            if (header == null) {
                System.out.println("CSV file is empty or not found");
                return;
            }
            bw.write(header);
            bw.newLine();

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                data[1] = CensorUtil.maskTeam(data[1]); // team1
                data[2] = CensorUtil.maskTeam(data[2]); // team2
                data[5] = CensorUtil.maskTeam(data[5]); // winner
                data[6] = CensorUtil.redactPlayer();    // player

                bw.write(String.join(",", data));
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("CSV censored successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

