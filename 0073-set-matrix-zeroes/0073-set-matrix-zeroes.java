class Solution {
    public void setZeroes(int[][] matrix) {

        int N = matrix.length;
        int M = matrix[0].length;
        int marker = Integer.MIN_VALUE;

        boolean found;

        while (true) {
            found = false;
            for (int i=0;i<N && !found; i++) {
                for (int j=0;j<M;j++) {
                    if (matrix[i][j] == marker) {
                        found = true;
                        marker++; 
                        break;
                    }
                }
            }
            if (!found) break;
        }

        for(int i=0;i<N;i++){
            boolean flag = false;
            for(int j=0;j<M;j++){
                if(matrix[i][j] == 0)
                  flag = true;
            }

            if(flag == true){
                for(int j=0;j<M;j++){
                    if(matrix[i][j]!=0)
                     matrix[i][j] = marker;
                }
            }
        }

        for(int j=0;j<M;j++){
            boolean flag = false;
            for(int i=0;i<N;i++){
                if(matrix[i][j] == 0)
                  flag = true;
            }

            if(flag == true){
                for(int i=0;i<N;i++){
                    if(matrix[i][j]!=0)
                     matrix[i][j] = marker;
                }
            }
        }

      for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(matrix[i][j] == marker)
               matrix[i][j] = 0;
        }
      }
        
    }
}