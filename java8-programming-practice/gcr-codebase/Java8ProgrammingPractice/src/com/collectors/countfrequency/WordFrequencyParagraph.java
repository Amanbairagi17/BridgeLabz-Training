package com.collectors.countfrequency;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyParagraph {
    public static void main(String[] args) {

        String paragraph = "Java is powerful and Java is widely used and Java is fun";

        Map<String, Long> mpfreq =
                Arrays.stream(paragraph.split("\\s+"))
                      .collect(Collectors.groupingBy(
                              word -> word,
                              Collectors.counting()
                      ));


        mpfreq.forEach((word, count) ->
                System.out.println(word + " : " + count));
    }
}