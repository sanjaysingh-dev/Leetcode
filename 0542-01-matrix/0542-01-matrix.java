class pair{

    int row;
    int col;
    int step;

    public pair(int row, int col, int step){
        this.row = row;
        this.col = col;
        this.step = step;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int N = mat.length;
        int M = mat[0].length;

        int vis[][] = new int[N][M];
        Queue<pair> q = new LinkedList<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(mat[i][j]==0){
                    q.offer(new pair(i,j,0));
                    vis[i][j] = 1;
                }
            }
        }

        int ans[][] = new int[N][M];

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};

        while(!q.isEmpty()){

            pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int s = p.step;

            ans[r][c] = s;

            for(int i=0;i<4;i++){

                int newr = r+dr[i];
                int newc = c+dc[i];

                if(newr>=0 && newr<N && newc>=0 && newc<M && 
                   vis[newr][newc]!=1){

                        q.offer(new pair(newr,newc,s+1));
                        vis[newr][newc] = 1;

                   }
            }
        }

        return ans;
    }
}