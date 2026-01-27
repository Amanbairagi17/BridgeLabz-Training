package com.regex;

public class ReplaceBadWord {
    public static void main(String[] args) {

        String text =
            "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid"};

        // create regex: \b(damn|stupid)\b
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        String censored =
            text.replaceAll("(?i)" + regex, "****");

        System.out.println(censored);
    }
}
