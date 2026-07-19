class Solution {

    int inf = (int)1e9;

    public int knapsack(int idx, int sum, int coins[], int dp[][]){

        if(sum==0)
         return 0;

        if(idx<0)
         return inf;

        if(dp[idx][sum]!=-1)
         return dp[idx][sum];

         int rej = knapsack(idx-1,sum,coins,dp);

         int sel = inf;

         if(coins[idx]<=sum)
          sel = knapsack(idx,sum-coins[idx],coins,dp)+1;

          return dp[idx][sum] = Math.min(rej,sel);
    }

    public int coinChange(int[] coins, int amount) {

        int N = coins.length;
        int dp[][] = new int[N][amount+1];

        for(int i=0;i<N;i++)
        Arrays.fill(dp[i],-1);

        int ans = knapsack(N-1,amount,coins,dp);
        
        if(ans==inf)
         return -1;

        else 
         return ans; 
    }
}