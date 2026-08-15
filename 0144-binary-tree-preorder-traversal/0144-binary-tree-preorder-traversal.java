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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lt=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(st.size()!=0){
            TreeNode cur=st.pop();
            if(cur==null) continue;
            lt.add(cur.val);
            
            st.push(cur.right);st.push(cur.left);

        }
        return lt;
    }
}