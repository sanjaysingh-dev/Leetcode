class Solution {

   static void reverse(int arr[]){
    int i = 0;
    int j = arr.length-1;

    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
   }

    public void rotate(int[][] matrix) {

        int N = matrix.length;

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
             }
        }
        
       for(int i=0;i<N;i++)
          reverse(matrix[i]);
        
    }
}