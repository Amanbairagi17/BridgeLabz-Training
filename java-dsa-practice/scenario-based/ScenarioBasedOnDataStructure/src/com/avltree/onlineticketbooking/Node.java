package com.avltree.onlineticketbooking;

public class Node {
    Event event;
    Node left, right;
    int height;

    Node(Event e) {
        event = e;
        height = 1;
    }
}