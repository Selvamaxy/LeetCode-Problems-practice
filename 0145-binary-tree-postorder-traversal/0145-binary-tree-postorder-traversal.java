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
    List<Integer> ans=new ArrayList<>();
    public void pot(TreeNode tptr){
        if(tptr==null) return;
        pot(tptr.left);
        pot(tptr.right);
        ans.add(tptr.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        

        if(root==null) return ans;
        pot(root);
        return ans;
    }
}