class Solution {

    int dr[] = {1,-1,0,0};
    int dc[] = {0,0,1,-1};

    public void dfs(char A[][], int i, int j){

        A[i][j] = '0';

        int N = A.length;
        int M = A[0].length;

        for(int d=0;d<4;d++){

            int nr = i+dr[d];
            int nc = j+dc[d];

            if(nr>=0 && nr<N && nc>=0 && nc<M && A[nr][nc]=='1')
              dfs(A,nr,nc);
        } 
    }

    public int numIslands(char[][] grid) {

        int N = grid.length;
        int M = grid[0].length;

        int count = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }

        return count;
        
    }
}