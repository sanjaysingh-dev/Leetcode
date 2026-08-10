class pair{

    int row;
    int col;

    public pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public void solve(char[][] board) {

        int N = board.length;
        int M = board[0].length;

        int vis[][] = new int[N][M];
        Queue<pair> q = new LinkedList<>();

        for(int j=0;j<M;j++){

            if(board[0][j]=='O' && vis[0][j]!=1){
              vis[0][j] = 1;
              q.offer(new pair(0,j));
            } 

            if(board[N-1][j]=='O' && vis[N-1][j]!=1){
             vis[N-1][j] = 1;  
             q.offer(new pair(N-1,j));
            }
        }

        for(int i=0;i<N;i++){

            if(board[i][0]=='O' && vis[i][0]!=1){
             vis[i][0] = 1;
             q.offer(new pair(i,0));
            }

            if(board[i][M-1]=='O' && vis[i][M-1]!=1){
             vis[i][M-1] = 1; 
             q.offer(new pair(i,M-1));
            }
        }

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};

        while(!q.isEmpty()){

            pair p = q.poll();
            int r = p.row;
            int c = p.col;

            for(int i=0;i<4;i++){

                int newr = r+dr[i];
                int newc = c+dc[i];

                if(newr>=0 && newr<N && newc>=0 && newc<M && 
                   vis[newr][newc]!=1 && board[newr][newc]=='O'){

                    vis[newr][newc] = 1;
                    q.offer(new pair(newr,newc));
                   }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(board[i][j]=='O' && vis[i][j]==0)
                  board[i][j] = 'X';
            }
        }
        
    }
}