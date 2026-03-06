class Solution {
    public int maxProfit(int[] prices) {

        int N = prices.length;
        int minprice = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;

        for(int i=0;i<N;i++){

            if(prices[i]<minprice)
              minprice = prices[i];

              int profit = prices[i] - minprice;

           maxprofit = Math.max(maxprofit,profit);   
        }
        
        return maxprofit;
    }
}