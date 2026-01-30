package com.avltree.hospitalqueuemanagement;

public class HospitalQueue {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, new Patient(930, "Aman"));
        tree.root = tree.insert(tree.root, new Patient(915, "Rohit"));
        tree.root = tree.insert(tree.root, new Patient(945, "Neha"));
        tree.root = tree.insert(tree.root, new Patient(900, "Kunal"));

        System.out.println("Patients by Arrival Time:");
        tree.inorder(tree.root);
    }
}