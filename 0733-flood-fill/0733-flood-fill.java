class pair{

    int row;
    int col;

    public pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int N = image.length;
        int M = image[0].length;

        int origC = image[sr][sc];

        if(origC==color)
         return image;

        image[sr][sc] = color;

        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(sr,sc)); 

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};

        while(!q.isEmpty()){

            pair p = q.poll();
            int row = p.row;
            int col = p.col;

            for(int i=0;i<4;i++){
                int newr = row+dr[i];
                int newc = col+dc[i];

                if(newr>=0 && newr<N && newc>=0 && newc<M && 
                   image[newr][newc]== origC){

                    image[newr][newc] = color;
                    q.offer(new pair(newr,newc));

                   }
            }
        }
        
        return image;
    }
}