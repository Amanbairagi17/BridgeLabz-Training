package com.regex;

import java.util.regex.*;

public class ExtractLanguage {

    public static void main(String[] args) {

        String text =
            "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String[] languages = {
            "Java", "Python", "JavaScript", "Go"
        };

        String regex =
            "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern =
            Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
