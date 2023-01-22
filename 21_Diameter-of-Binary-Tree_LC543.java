/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int curr = maxDepth(root.left)+maxDepth(root.right);

        return Math.max(curr,Math.max(ld,rd));

    }
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}