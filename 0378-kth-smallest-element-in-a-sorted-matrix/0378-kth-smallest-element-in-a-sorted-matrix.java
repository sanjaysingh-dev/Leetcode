class Node{

    int val;
    int row;
    int col;

    public Node(int val,int row,int col){
        this.val = val;
        this.row = row;
        this.col = col;
    }
}

class Solution {

    public int kthSmallest(int[][] matrix, int k) {

       int N =  matrix.length;
       int M = matrix[0].length;

       PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.val-b.val);

       for(int i=0;i<N;i++)
        pq.offer(new Node(matrix[i][0],i,0));

       for(int i=1;i<k;i++){

        Node curr = pq.poll();

        if(curr.col+1<M)
         pq.offer(new Node(matrix[curr.row][curr.col+1],
                           curr.row,curr.col+1)); 
       } 

       return pq.peek().val;
    }
}