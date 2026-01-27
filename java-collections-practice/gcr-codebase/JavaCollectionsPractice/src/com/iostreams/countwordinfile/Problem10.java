package com.iostreams.countwordinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Problem10 {
	public static void main(String[] args) {

        String filePath = "C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsPractice\\src\\com\\iostreams\\countwordinfile\\inputfile.txt";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // READ FILE
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // remove punctuation and convert to lowercase
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

                // split words
                String[] words = line.split("\\s+");

                for (String word : words) {

                    if (word.isEmpty())
                        continue;

                    wordCountMap.put(
                            word,
                            wordCountMap.getOrDefault(word, 0) + 1
                    );
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // sort word by frequency
        List<Map.Entry<String, Integer>> wordList =
                new ArrayList<>(wordCountMap.entrySet());

        wordList.sort((a, b) -> b.getValue() - a.getValue());

        //display top 5 words
        System.out.println("Top 5 Words in file ");

        int limit = Math.min(5, wordList.size());

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println(
                    (i + 1) + ". " + entry.getKey() +
                    " : " + entry.getValue()
            );
        }
    }
}
