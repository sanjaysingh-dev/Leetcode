/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null)
         return "";

        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        q.offer(root);

        while(!q.isEmpty()){

            TreeNode rem = q.poll();

            if(rem==null){
                sb.append("null,");
                continue;
            }

            sb.append(rem.val).append(",");

            q.offer(rem.left);
            q.offer(rem.right); 
        }

        return sb.toString(); 
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if(data == null || data.length() == 0)
         return  null;

         String str[] = data.split(",");

         if(str[0].equals("null"))
           return null;

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
         
         q.offer(root);

         int i = 1;

         while(!q.isEmpty() && i<str.length){

            TreeNode curr = q.poll();

            if(i<str.length && !str[i].equals("null")){
                curr.left = new TreeNode(Integer.parseInt(str[i]));
                q.offer(curr.left);  
            }

            i++;

            if(i<str.length && !str[i].equals("null")){
                curr.right = new TreeNode(Integer.parseInt(str[i]));
                q.offer(curr.right);
            }

            i++;
         }  

         return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));