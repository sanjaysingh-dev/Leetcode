class Solution {
    public int countNegatives(int[][] grid) {

        int N = grid.length;
        int M = grid[0].length;
        int count = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(grid[i][j]<0)
                  count++;
            }
        }

        return count;
        
    }
}