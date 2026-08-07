class pair{

    int r;
    int c;
    int t;

    public pair(int r,int c,int t){
        this.r = r;
        this.c = c;
        this.t = t;
    }
}

class Solution {

    public int orangesRotting(int[][] grid) {

        int N = grid.length;
        int M = grid[0].length;

        int fresh = 0;

        int vis[][] = new int[N][M];
        Queue<pair> q = new LinkedList<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){

                if(grid[i][j]==2){
                    q.offer(new pair(i,j,0));
                    vis[i][j]=2;
                }   

                else if(grid[i][j]==1)
                   fresh++;
            }
        }

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};
        int maxT = 0;

        int count = 0;
        
        while(!q.isEmpty()){

            pair p = q.poll();
            int row = p.r;
            int col = p.c;
            int time = p.t;

            maxT = Math.max(maxT,time);

            for(int i=0;i<4;i++){
                int newr = row+dr[i];
                int newc = col+dc[i];

                if(newr>=0 && newr<N && newc>=0 && newc<M &&
                   vis[newr][newc]!=2 && grid[newr][newc]==1){

                    q.offer(new pair(newr,newc,time+1));
                    vis[newr][newc] = 2;
                    count++;
                   }
            }
        }

        if(count!=fresh)
         return -1;

         return maxT;
        
    }
}