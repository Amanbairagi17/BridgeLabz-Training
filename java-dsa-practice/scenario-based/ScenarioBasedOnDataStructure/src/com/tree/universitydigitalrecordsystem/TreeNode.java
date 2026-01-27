package com.tree.universitydigitalrecordsystem;

public class TreeNode {
    Student student;
    TreeNode left;
    TreeNode right;

    TreeNode(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }
}