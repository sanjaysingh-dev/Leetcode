class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int N = matrix.length;
        int M = matrix[0].length;

        int low = 0, high =(N*M)-1;

        while(low<=high){

            int mid = low +(high-low)/2;
            int i = mid/M;
            int j = mid%M;

            if(matrix[i][j] == target)
             return true;

            else if(matrix[i][j]>target)
             high = mid - 1;

            else 
             low = mid + 1; 
        }

        return false;
    }
}