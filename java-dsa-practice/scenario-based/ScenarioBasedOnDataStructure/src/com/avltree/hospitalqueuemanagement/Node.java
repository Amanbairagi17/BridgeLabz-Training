package com.avltree.hospitalqueuemanagement;

public class Node {
    Patient patient;
    Node left, right;
    int height;

    Node(Patient p) {
        patient = p;
        height = 1;
    }
}