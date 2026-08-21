class Solution {

    public boolean jump(int A[],int idx, int N, int dp[]){

        if(idx==N-1)
         return true;

        if(dp[idx]!=-1)
         return dp[idx]==1; 

         for(int i=1;i<=A[idx] && i+idx<N;i++){
            if(jump(A,idx+i,N,dp)){
              dp[idx] = 1;
              return true;
            } 
         }

         dp[idx] = 0;
         return false;
    }   


    public boolean canJump(int[] nums) {

        int N = nums.length;

        int dp[] = new int[N];
        Arrays.fill(dp,-1);
        
        return jump(nums,0,N,dp);
        
    }
}