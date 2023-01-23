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
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        return findTargetHelper(root,k,set);
    }

    public boolean findTargetHelper(TreeNode root, int k, Set<Integer> set) {
        if(root == null){
            return false;
        }
        if(!set.contains(k-root.val)){
            set.add(root.val);
        }
        else{
            return true;
        }

        return findTargetHelper(root.left,k,set) || findTargetHelper(root.right,k,set);
    }

}