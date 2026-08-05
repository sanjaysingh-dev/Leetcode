class Solution {

    public void queen(int col,char[][] board,int leftrow[], int lowerD[], int upperD[], List<List<String>> ans, int N){

        if(col==N){
            
            List<String> list = new ArrayList<>();
            
            for(int i=0;i<N;i++)
            list.add(new String(board[i]));

            ans.add(list);
            return;
        }

        for(int row=0;row<N;row++){
            if(leftrow[row]==0 && lowerD[row+col]==0 && upperD[N-1+col-row]==0){
            board[row][col] = 'Q';
            leftrow[row] = 1;
            lowerD[row+col] = 1;
            upperD[N-1+col-row] = 1;

            queen(col+1,board,leftrow,lowerD,upperD,ans,N);
            
            leftrow[row] = 0;
            lowerD[row+col] = 0;
            upperD[N-1+col-row] = 0;
            board[row][col] = '.';
            }
        }

    }


    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i=0;i<n;i++)
         Arrays.fill(board[i],'.');

         int leftrow[] = new int[n];
         int lowerD[] = new int[2*n-1];
         int upperD[] = new int[2*n-1];

        queen(0,board,leftrow,lowerD,upperD,ans,n);
        return ans;  
        
    }
}