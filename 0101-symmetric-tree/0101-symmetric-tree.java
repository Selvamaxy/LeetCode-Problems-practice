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
    public boolean isSym(TreeNode a,TreeNode b){
        if(a==null || b==null) return a==b;
        if(a.val!=b.val) return false;
        return isSym(a.left,b.right) && isSym(a.right,b.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left,root.right);
    }
}