//1339. Maximum Product of Splitted Binary Tree
class Solution {

    private long totalSum = 0;
    private long maxProduct = 0;
    private static final int MOD = 1_000_000_007;

    private long findTotalSum(TreeNode root){
        if(root == null) return 0;
        return root.val + findTotalSum(root.left) + findTotalSum(root.right);

    }

    private long dfs(TreeNode root){
        if(root == null) return 0;

        long left = dfs(root.left);
        long right = dfs(root.right);
        
        long sumOfSubTree = root.val + left + right;

        long product = sumOfSubTree * (totalSum - sumOfSubTree);
        maxProduct = Math.max(maxProduct, product);
       // System.out.println(totalSum+ " " +sumOfSubTree+ " " +product+ " " +maxProduct);
        return sumOfSubTree;
    }
    public int maxProduct(TreeNode root) {
        totalSum = findTotalSum(root);
        maxProduct = 0;
        dfs(root);
        return (int) (maxProduct % MOD);
    }
}