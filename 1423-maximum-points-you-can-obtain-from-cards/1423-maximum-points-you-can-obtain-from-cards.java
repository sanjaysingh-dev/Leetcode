class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int N = cardPoints.length;
        int sum = 0;

       for(int i=0;i<k;i++)
         sum+=cardPoints[i];

       int maxsum = sum;

       for(int i=1;i<=k;i++){
        sum = sum - cardPoints[k-i]+cardPoints[N-i];
        maxsum = Math.max(maxsum,sum);
       }  

       return maxsum;
        
    }
}