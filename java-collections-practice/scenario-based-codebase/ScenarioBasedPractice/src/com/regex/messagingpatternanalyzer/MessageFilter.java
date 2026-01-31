package com.regex.messagingpatternanalyzer;

public interface MessageFilter<T> {
    boolean allow(T message);
}