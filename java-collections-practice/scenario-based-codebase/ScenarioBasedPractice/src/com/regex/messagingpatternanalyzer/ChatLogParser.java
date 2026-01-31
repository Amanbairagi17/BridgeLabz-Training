package com.regex.messagingpatternanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    // [12:02 PM] John: Hello
    private static final Pattern CHAT_PATTERN =
            Pattern.compile(
                    "\\[(\\d{1,2}:\\d{2}\\s[AP]M)]\\s(.*?):\\s(.*)"
            );

    public static void main(String[] args) {

        File file = new File("src/com/regex/source/chatlogs.txt");

        // TreeMap → auto alphabetical order
        Map<String, List<String>> userMessages =
                new TreeMap<>();

        MessageFilter<String> filter =
                new IdleChatFilter();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher matcher =
                        CHAT_PATTERN.matcher(line);

                if (!matcher.matches())
                    continue;

                String time = matcher.group(1);
                String user = matcher.group(2);
                String message = matcher.group(3);

                // filter idle chat
                if (!filter.allow(message))
                    continue;

                userMessages
                        .computeIfAbsent(
                                user,
                                k -> new ArrayList<>())
                        .add("[" + time + "] " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -----------------------------
        // Display result
        // -----------------------------
        System.out.println(" CHAT ANALYSIS \n");

        userMessages.forEach((user, messages) -> {
            System.out.println(user + ":");
            for (String msg : messages)
                System.out.println("  " + msg);
            System.out.println();
        });
    }
}
