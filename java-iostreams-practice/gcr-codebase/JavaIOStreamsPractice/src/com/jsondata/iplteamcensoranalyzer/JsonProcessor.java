package com.jsondata.iplteamcensoranalyzer;

import org.json.*;
import java.io.*;
import java.util.Iterator;

public class JsonProcessor {

    public static void processJson(String input, String output) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null)
                sb.append(line);

            br.close();

            JSONArray matches = new JSONArray(sb.toString());
            JSONArray result = new JSONArray();

            for (int i = 0; i < matches.length(); i++) {

                JSONObject obj = matches.getJSONObject(i);

                String team1 = obj.getString("team1");
                String team2 = obj.getString("team2");

                obj.put("team1", CensorUtil.maskTeam(team1));
                obj.put("team2", CensorUtil.maskTeam(team2));
                obj.put("winner", CensorUtil.maskTeam(obj.getString("winner")));
                obj.put("player_of_match", CensorUtil.redactPlayer());

                // censor score keys
                JSONObject score = obj.getJSONObject("score");
                JSONObject newScore = new JSONObject();

                Iterator<String> keys = score.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    newScore.put(
                            CensorUtil.maskTeam(key),
                            score.get(key)
                    );
                }

                obj.put("score", newScore);
                result.put(obj);
            }

            FileWriter fw = new FileWriter(output);
            fw.write(result.toString(4));
            fw.close();

            System.out.println(" JSON censored successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
