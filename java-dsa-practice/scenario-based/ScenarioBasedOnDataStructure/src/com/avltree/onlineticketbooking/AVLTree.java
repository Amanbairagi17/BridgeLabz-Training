package com.avltree.onlineticketbooking;

public class AVLTree {
    Node root;

    int height(Node n) {
        return n == null ? 0 : n.height;
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int balance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    Node insert(Node node, Event e) {

        if (node == null)
            return new Node(e);

        if (e.startTime < node.event.startTime)
            node.left = insert(node.left, e);
        else
            node.right = insert(node.right, e);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int b = balance(node);

        if (b > 1 && e.startTime < node.left.event.startTime)
            return rightRotate(node);

        if (b < -1 && e.startTime > node.right.event.startTime)
            return leftRotate(node);

        if (b > 1 && e.startTime > node.left.event.startTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (b < -1 && e.startTime < node.right.event.startTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.event.startTime + " -> " + node.event.name);
            inorder(node.right);
        }
    }
}