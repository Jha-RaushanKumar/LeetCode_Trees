/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int count = 1;
            while(size>0){
                if(q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek().right != null){
                    q.add(q.peek().right);
                }
                if(count == 1){
                    ans.add(q.remove().data);
                }
                else{
                    q.remove();
                }
                count++;
                size--;
            }
        }
        return ans;
    }
}