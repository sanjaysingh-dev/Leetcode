/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        boolean left = check(root,p);
        boolean right = check(root,q);

        if(left == false || right == false)
         return null;

         return LCA(root,p,q);
        
    }

    public boolean check(TreeNode root, TreeNode x){

        if(root == null)
         return false;

        if(root == x)
         return true;

         boolean left = check(root.left,x);
         boolean right = check(root.right,x);

         if(left == true || right == true)
          return true;

          return false;  

    }

    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){

        if(root == null)
         return null;

        if(root == p || root == q)
         return root;

        TreeNode l = LCA(root.left,p,q);
        TreeNode r = LCA(root.right,p,q);

        if(l == null)
         return r;
         
        else if(r == null)
         return l;

         else
          return root;    
    } 
}