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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int isi = 0;
        int iei = inorder.length-1;

        int psi = 0;
        int pei = preorder.length-1;

        return build(inorder,preorder,isi,iei,psi,pei);
        
    }

    public TreeNode build(int inO[], int pO[], int isi, int iei,int psi,int pei){

        if(isi>iei || psi>pei)
         return null;

        TreeNode root = new TreeNode(pO[psi]);
        int ridx = -1;

        for(int i=isi;i<=iei;i++){
            if(inO[i]==root.val){
             ridx = i;
             break;
           }
        }

        int count = ridx-isi;

        root.left = build(inO,pO,isi,ridx-1,psi+1,psi+count);
        root.right = build(inO,pO,ridx+1,iei,psi+count+1,pei);

        return root;
    }
}