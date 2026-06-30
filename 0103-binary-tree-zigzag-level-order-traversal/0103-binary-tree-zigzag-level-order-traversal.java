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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
         return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean leftToright = true;

        while(!q.isEmpty()){

            int sz = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<sz;i++){

                TreeNode rem = q.poll();

                if(leftToright == true)
                 list.addLast(rem.val);

                else 
                 list.addFirst(rem.val);

                if(rem.left!=null)
                 q.offer(rem.left);

                if(rem.right!=null)
                 q.offer(rem.right);   
            }

            ans.add(list);
            leftToright = !leftToright;
        }  

        return ans;
        
    }
}