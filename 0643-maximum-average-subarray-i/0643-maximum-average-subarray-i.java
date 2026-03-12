class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int N = nums.length;
        double sum = 0;

        for(int i=0;i<k;i++)
          sum+=nums[i];

        double avg = sum/k;
        double maxavg = avg;
        int s = 1;
        int e = k;

        while(e<N){
            sum= sum - nums[s-1] + nums[e];
            avg = sum/k;
            maxavg = Math.max(maxavg,avg);
            s++;
            e++;
        }  

        return maxavg;
        
    }
}