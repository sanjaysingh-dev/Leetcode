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
    public TreeNode invertTree(TreeNode root) {

        if(root==null)
         return null;

        invert(root);
        return  root;
        
    }

    public void invert(TreeNode root){

        if(root == null)
          return;

        swap(root);
        invert(root.left);
        invert(root.right); 
    }

    public void swap(TreeNode A){

        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
    }  
}