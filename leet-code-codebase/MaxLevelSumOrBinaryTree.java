//1161. Maximum Level Sum of a Binary Tree
class Solution {
    public int maxLevelSum(TreeNode root) {
        int level = 0;
        int maxSum = Integer.MIN_VALUE;
        int ans = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            level++;
            int sumLevelWise = 0;
            int size = queue.size();

            while(size > 0){
                TreeNode node = queue.poll();
                sumLevelWise += node.val;

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                size--;
            }
            if(maxSum < sumLevelWise){
                maxSum = sumLevelWise;
                ans = level;
            }
        }
        return ans;
    }
}