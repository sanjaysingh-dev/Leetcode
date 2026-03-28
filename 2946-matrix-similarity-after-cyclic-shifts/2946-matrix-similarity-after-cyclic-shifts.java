class Solution {

    static void reverse(int A[], int s, int e){
        
        int N = A.length;
        
        while(s<e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
   }

    public boolean areSimilar(int[][] mat, int k) {

     int M = mat.length;
     int N = mat[0].length;

     int arr[][] = new int[M][N];
     k = k%N;

      for(int i=0;i<M;i++){
            for(int j=0;j<N;j++)
               arr[i][j] = mat[i][j];
        }

     for(int i=0;i<M;i++){

        if(i%2==0){
            reverse(mat[i],0,k-1);
            reverse(mat[i],k,N-1);
            reverse(mat[i],0,N-1);
        }

        else if(i%2!=0){
            reverse(mat[i],0,N-1);
            reverse(mat[i],0,k-1);
            reverse(mat[i],k,N-1);
        }
     }

      for(int i=0;i<M;i++){
        for(int j=0;j<N;j++){
            if(arr[i][j]!=mat[i][j])
               return false;
        }
      }

      return true;
        
    }
}