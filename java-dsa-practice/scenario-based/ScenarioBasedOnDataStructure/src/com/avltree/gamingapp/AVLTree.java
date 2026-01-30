package com.avltree.gamingapp;

public class AVLTree {
    private AVLNode root;

    int height(AVLNode n) {
        return n == null ? 0 : n.height;
    }

    int getBalance(AVLNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    /* ---------- INSERT / UPDATE PLAYER ---------- */

    public void insert(Player p) {
        root = insertRec(root, p);
    }

    private AVLNode insertRec(AVLNode node, Player p) {

        if (node == null)
            return new AVLNode(p);

        if (p.score < node.player.score)
            node.left = insertRec(node.left, p);
        else
            node.right = insertRec(node.right, p);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && p.score < node.left.player.score)
            return rightRotate(node);

        // RR
        if (balance < -1 && p.score > node.right.player.score)
            return leftRotate(node);

        // LR
        if (balance > 1 && p.score > node.left.player.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && p.score < node.right.player.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    
    //top players
    public void displayTopPlayers() {
        System.out.println("Top Players:");
        reverseInorder(root);
    }

    private void reverseInorder(AVLNode node) {
        if (node != null) {
            reverseInorder(node.right);
            System.out.println(node.player.name + " → " + node.player.score);
            reverseInorder(node.left);
        }
    }

    //delete players
    public void delete(int score) {
        root = deleteRec(root, score);
    }

    private AVLNode deleteRec(AVLNode root, int score) {

        if (root == null) return null;

        if (score < root.player.score)
            root.left = deleteRec(root.left, score);
        else if (score > root.player.score)
            root.right = deleteRec(root.right, score);
        else {

            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                AVLNode temp = minValue(root.right);
                root.player = temp.player;
                root.right = deleteRec(root.right, temp.player.score);
            }
        }

        if (root == null) return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root); 
        }

        return root;
    }

    AVLNode minValue(AVLNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}