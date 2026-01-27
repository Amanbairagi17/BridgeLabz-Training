package com.tree.ecommerceproductinventory;

public class TreeNode {
    Product product;
    TreeNode left;
    TreeNode right;

    TreeNode(Product product) {
        this.product = product;
        this.left = null;
        this.right = null;
    }
}