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

    int res = 0;
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        maxDepth(root);
        return res;
    }
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        res+=Math.abs(lh-rh);
        return root.val+lh+rh;
        
    }
}