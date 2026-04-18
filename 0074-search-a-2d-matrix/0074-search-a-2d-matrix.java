class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int N = matrix.length;
        int M = matrix[0].length;

        int i = 0;
        int j = M-1;

        while(i<N && j>=0){

                if(matrix[i][j] == target)
                  return true;

                else if(target>matrix[i][j])
                  i++;

                else 
                 j--;    
            }
        
        return false;
    }
}