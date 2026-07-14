class Solution {

    public int minSq(int n, int dp[]){

        if(n==0)
         return 0;

        if(dp[n]!=-1)
         return dp[n];

        int ans = Integer.MAX_VALUE;

        for(int i=1;i*i<=n;i++)
         ans = Math.min(ans,minSq(n-(i*i),dp)+1);

         dp[n] = ans;
         return ans;   
    }

    public int numSquares(int n) {

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        return minSq(n,dp);
        
    }
}