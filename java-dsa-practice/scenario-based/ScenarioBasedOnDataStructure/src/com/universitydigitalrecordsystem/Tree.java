package com.universitydigitalrecordsystem;

public class Tree {
    private TreeNode root;

    //insert
    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private TreeNode insertRec(TreeNode root, Student student) {

        if (root == null)
            return new TreeNode(student);

        if (student.rollNo < root.student.rollNo)
            root.left = insertRec(root.left, student);

        else if (student.rollNo > root.student.rollNo)
            root.right = insertRec(root.right, student);

        return root;
    }

    //search
    public Student search(int rollNo) {
        TreeNode node = searchRec(root, rollNo);
        return node == null ? null : node.student;
    }

    private TreeNode searchRec(TreeNode root, int rollNo) {

        if (root == null || root.student.rollNo == rollNo)
            return root;

        if (rollNo < root.student.rollNo)
            return searchRec(root.left, rollNo);

        return searchRec(root.right, rollNo);
    }

    //delete
    public void delete(int rollNo) {
        root = deleteRec(root, rollNo);
    }

    private TreeNode deleteRec(TreeNode root, int rollNo) {

        if (root == null)
            return null;

        if (rollNo < root.student.rollNo)
            root.left = deleteRec(root.left, rollNo);

        else if (rollNo > root.student.rollNo)
            root.right = deleteRec(root.right, rollNo);

        else {

            // case 1: no child
            if (root.left == null && root.right == null)
                return null;

            // case 2: one child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // case 3: two children
            TreeNode successor = findMin(root.right);
            root.student = successor.student;
            root.right = deleteRec(root.right, successor.student.rollNo);
        }

        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    //display sorted
    public void displaySorted() {
        System.out.println("Sorted Roll Numbers:");
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                    root.student.rollNo + "  " +
                    root.student.name + "  " +
                    root.student.department);
            inorder(root.right);
        }
    }
}