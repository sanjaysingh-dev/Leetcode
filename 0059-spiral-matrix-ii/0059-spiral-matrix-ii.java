class Solution {
    public int[][] generateMatrix(int n) {

        int ans[][] = new int[n][n];
        int i = 0;
        int j = 0;
        int e = 1;

        while(n>1){

            for(int k=1;k<n;k++){
                ans[i][j] = e;
                e++;
                j++;
            }

            for(int k=1;k<n;k++){
                ans[i][j] = e;
                e++;
                i++;
            }

            for(int k=1;k<n;k++){
                ans[i][j] = e;
                e++;
                j--;
            }

            for(int k=1;k<n;k++){
                ans[i][j] = e;
                e++;
                i--;
            }

            i++;
            j++;
            n-=2;
        } 

        if(n==1)
          ans[i][j] = e;

          return ans;

        
    }
}