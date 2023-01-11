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
/*  **Recursive Approach -- TC:O(N) SC:O(N)**
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        inorderTraversalHelper(root,ans);
        return ans;
    }
    public void inorderTraversalHelper(TreeNode root, List<Integer> ans) {

        if(root == null){
            return;
        }
        inorderTraversalHelper(root.left,ans);
        ans.add(root.val);
        inorderTraversalHelper(root.right,ans);     
    }
*/
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(!st.isEmpty() || curr != null){
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }
}