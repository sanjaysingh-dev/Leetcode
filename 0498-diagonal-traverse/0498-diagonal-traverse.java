class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int N = mat.length;
        int M = mat[0].length;

        int ans[] = new int[N*M];
        int idx = 0;

        for(int d=0;d<N+M-1;d++){


            if(d%2==0){
                int row = Math.min(d,N-1);
                int col = d-row;

                while(row>=0 && col<M){
                    ans[idx++] = mat[row][col];
                    row--;
                    col++;
                }
            }

            else{

                int col = Math.min(d,M-1);
                int row = d-col;

                while(col>=0 && row<N){
                    ans[idx++] = mat[row][col];
                    col--;
                    row++;
                }
            }
        }

        return ans;
        
    }
}