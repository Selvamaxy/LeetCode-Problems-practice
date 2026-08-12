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
    public TreeNode bst(int[] nums,int st,int ed ){
        if(st>ed) return null ;
        int mid=(st+ed)/2;
        TreeNode newn=new TreeNode(nums[mid]);
        newn.left=bst(nums,st,mid-1);
        newn.right=bst(nums,mid+1,ed);
        return newn;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return bst(nums,0,nums.length-1);
    }
}