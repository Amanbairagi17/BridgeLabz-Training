package com.tree.ecommerceproductinventory;

public class Tree {
	private TreeNode root;

    //insert product
    public void insert(Product product) {
        root = insertRec(root, product);
    }

    private TreeNode insertRec(TreeNode root, Product product) {

        if (root == null)
            return new TreeNode(product);

        if (product.sku < root.product.sku)
            root.left = insertRec(root.left, product);

        else if (product.sku > root.product.sku)
            root.right = insertRec(root.right, product);

        return root;
    }

    // searching for product
    public Product search(int sku) {
        TreeNode node = searchRec(root, sku);
        return node == null ? null : node.product;
    }

    private TreeNode searchRec(TreeNode root, int sku) {

        if (root == null || root.product.sku == sku)
            return root;

        if (sku < root.product.sku)
            return searchRec(root.left, sku);

        return searchRec(root.right, sku);
    }

    //price update
    public boolean updatePrice(int sku, double newPrice) {
        Product product = search(sku);

        if (product != null) {
            product.price = newPrice;
            return true;
        }
        return false;
    }

    //sorted display
    public void displaySorted() {
        System.out.println("Products in Sorted SKU Order:");
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                    "SKU: " + root.product.sku +
                    ", Name: " + root.product.name +
                    ", Price: ₹" + root.product.price);
            inorder(root.right);
        }
    }
}
