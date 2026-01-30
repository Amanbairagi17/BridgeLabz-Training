package com.avltree.onlineticketbooking;

public class TicketBookingApp {
	public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, new Event(1800, "Concert"));
        tree.root = tree.insert(tree.root, new Event(1200, "Movie"));
        tree.root = tree.insert(tree.root, new Event(1500, "Standup"));
        tree.root = tree.insert(tree.root, new Event(1000, "Conference"));

        System.out.println("Upcoming Events:");
        tree.inorder(tree.root);
    }
}
