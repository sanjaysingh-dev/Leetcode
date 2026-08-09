class pair{

    int row;
    int col;

    public pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int N = image.length;
        int M = image[0].length;

        int ocolor = image[sr][sc];

        if(ocolor == color)
          return image;
  
        int vis[][] = new int[N][M];

        for(int i =0;i<N;i++)
            vis[i] = image[i].clone();

         vis[sr][sc] = color;   


        Queue<pair> q = new LinkedList<>();

        q.offer(new pair(sr,sc));

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};

        while(!q.isEmpty()){

            pair p = q.poll();
            int row = p.row;
            int col = p.col;

            for(int i=0;i<4;i++){
                int newrow = row + dr[i];
                int newcol = col + dc[i];

                if(newrow>=0 && newrow<N && newcol>=0 && newcol<M &&
                    vis[newrow][newcol]==ocolor){

                        vis[newrow][newcol] = color;
                        q.offer(new pair(newrow,newcol));
                    }
            }

        }

        return vis;
        
    }
}