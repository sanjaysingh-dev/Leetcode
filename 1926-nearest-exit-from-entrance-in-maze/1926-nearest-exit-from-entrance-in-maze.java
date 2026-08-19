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
    public int nearestExit(char[][] maze, int[] entrance) {

        int N = maze.length;
        int M = maze[0].length;
        
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(entrance[0],entrance[1],0));

        maze[entrance[0]][entrance[1]] = '+';

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};

        while(!q.isEmpty()){

            pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int s = p.step;

           if ((r == 0 || r == N-1 || c == 0 || c == M-1) &&
               (r != entrance[0] || c != entrance[1])) 
                return s;
              

            for(int i=0;i<4;i++){

                int nr = r+dr[i];
                int nc = c+dc[i];

                if(nr>=0 && nr<N && nc>=0 && nc<M &&
                   maze[nr][nc]=='.'){

                    maze[nr][nc] = '+';
                    q.offer(new pair(nr,nc,s+1));
                
                }      
            }
        }  

         return -1;
    }
}