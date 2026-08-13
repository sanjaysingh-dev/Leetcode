class pair{

    int row;
    int col;

    public pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {

    public void bfs(int row, int col, boolean vis[][], char grid[][]){

        int N = grid.length;
        int M = grid[0].length;

        vis[row][col] = true;

        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(row,col));

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};

        while(!q.isEmpty()){

            pair p = q.poll();
            int r = p.row;
            int c = p.col;

            for(int i=0;i<4;i++){
                    int nr = r+dr[i];
                    int nc = c+dc[i];

                    if(nr>=0 && nr<N && nc>=0 && nc<M
                       && !vis[nr][nc] && grid[nr][nc]=='1'){

                        vis[nr][nc]= true;
                        q.offer(new pair(nr,nc));
                       } 
            }
        }
        
    }

    public int numIslands(char[][] grid) {

        int N = grid.length;
        int M = grid[0].length;

        boolean vis[][] = new boolean[N][M];
        int count = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }

        return count;
        
    }
}