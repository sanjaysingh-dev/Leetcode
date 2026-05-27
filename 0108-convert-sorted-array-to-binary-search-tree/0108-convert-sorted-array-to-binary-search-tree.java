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
    public TreeNode sortedArrayToBST(int[] nums) {

        int N = nums.length;

        return createTree(nums,0,N-1); 
        
    }

    public TreeNode createTree(int A[],int s,int e){

        if(s>e)
         return null;

        int mid = s+(e-s)/2;

        TreeNode root = new TreeNode(A[mid]);
        root.left = createTree(A,s,mid-1);
        root.right = createTree(A,mid+1,e);

        return root;
    }
}