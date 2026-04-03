class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int M = mat.length;
        int N = mat[0].length;
        int arr[] = new int[2];
        int ans = 0;

        for(int i=0;i<M;i++){
            int count = 0;

            for(int j=0;j<N;j++){
                if(mat[i][j]==1)
                  count++;
            }

            if(count>ans){
                ans = count;
                arr[0] = i;
                arr[1] = count;
            }
        }
      
      return arr;        
    }
   }