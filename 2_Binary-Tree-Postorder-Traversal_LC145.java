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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        postorderTraversalHelper(root,ans);
        return ans; 
    }
    public void postorderTraversalHelper(TreeNode root, List<Integer> ans) {

        if(root == null){
            return;
        }
        postorderTraversalHelper(root.left,ans);
        postorderTraversalHelper(root.right,ans);
        ans.add(root.val);     
    }
*/
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr.left != null){
                st.add(curr.left);
            }
            if(curr.right != null){
                st.add(curr.right);
            }
            ans.add(0,curr.val);
        }
        return ans;
    }
}