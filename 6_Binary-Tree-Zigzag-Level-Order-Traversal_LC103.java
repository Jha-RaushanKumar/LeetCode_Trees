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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        //Approach1 -- TC:O(N) SC:O(N)
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){

            List<Integer> ansHelper = new ArrayList<>();
            int size = q.size();
            while(size > 0){
                if(q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek().right != null){
                    q.add(q.peek().right);
                }
                if(count%2 == 0){
                    ansHelper.add(q.remove().val);
                }
                else{
                    ansHelper.add(0,q.remove().val);
                }
                size--;
            }
            count++;
            ans.add(ansHelper);
        }
        return ans;
        
    }
}