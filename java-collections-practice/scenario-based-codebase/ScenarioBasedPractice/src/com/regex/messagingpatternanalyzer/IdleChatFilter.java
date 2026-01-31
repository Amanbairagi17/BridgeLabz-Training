package com.regex.messagingpatternanalyzer;

import java.util.*;

public class IdleChatFilter implements MessageFilter<String> {

    private final Set<String> idleWords =
            Set.of("lol", "brb", "rofl", "afk", "ttyl");

    @Override
    public boolean allow(String message) {

        String msg = message.toLowerCase();

        for (String word : idleWords) {
            if (msg.contains(word))
                return false;
        }
        return true;
    }
}