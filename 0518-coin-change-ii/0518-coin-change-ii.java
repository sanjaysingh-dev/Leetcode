class Solution {

    public int knapsack(int idx, int amt, int coins[], int dp[][]){

        if(amt==0)
         return 1;

        if(idx<0)
         return 0;

        if(dp[idx][amt]!=-1)
         return dp[idx][amt]; 

        int rej = knapsack(idx-1,amt,coins,dp);  
        int sel = 0;

        if(coins[idx]<=amt)
         sel = knapsack(idx,amt-coins[idx],coins,dp);

         return dp[idx][amt] = rej+sel;
    } 

    public int change(int amount, int[] coins) {

        int N = coins.length;

        int dp[][] = new int[N][amount+1];

        for(int i=0;i<N;i++)
         Arrays.fill(dp[i],-1);

        return knapsack(N-1,amount,coins,dp); 
        
    }
}