class Solution {

    public boolean isSafe(int row, int col, char[][] board, int N){

        int r = row;
        int c = col;

        while(r>=0 && c>=0){
            if(board[r][c]=='Q')
             return false;

            r--;
            c--; 
        }

        r = row;
        c = col;
        
        while(c>=0){
            if(board[r][c] == 'Q')
             return false;

            c--; 
        }

        r = row;
        c = col;

        while(r<N && c>=0){
            if(board[r][c] == 'Q')
             return false;

            r++;
            c--; 
        }

        return true;

    }

    public void queen(int col,char[][] board, List<List<String>> ans, int N){

        if(col==N){
            
            List<String> list = new ArrayList<>();
            
            for(int i=0;i<N;i++)
            list.add(new String(board[i]));

            ans.add(list);
            return;
        }

        for(int row=0;row<N;row++){
            if(isSafe(row,col,board,N)){
            board[row][col] = 'Q';
            queen(col+1,board,ans,N);
            board[row][col] = '.';
            }
        }

    }


    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i=0;i<n;i++)
         Arrays.fill(board[i],'.');

        queen(0,board,ans,n);
        return ans;  
        
    }
}