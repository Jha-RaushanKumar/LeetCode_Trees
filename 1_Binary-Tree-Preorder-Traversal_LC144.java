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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        preorderTraversalHelper(root,ans);
        return ans;        
    }
    public void preorderTraversalHelper(TreeNode root, List<Integer> ans) {

        if(root == null){
            return;
        }
        ans.add(root.val);
        preorderTraversalHelper(root.left,ans);
        preorderTraversalHelper(root.right,ans);       
    }
*/  
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            ans.add(curr.val);

            if(curr.right != null){
                st.add(curr.right);
            }
            if(curr.left != null){
                st.add(curr.left);
            }    
        }
        return ans;
    }
}