class Solution {
    public int maxProduct(int[] nums) {

        int N = nums.length;

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i=1;i<N;i++){
        
        int curr = nums[i];

        int tempmax = Math.max(curr,Math.max(curr*max,curr*min)); 
        int tempmin = Math.min(curr,Math.min(curr*max,curr*min));

        max = tempmax;
        min = tempmin;

        result = Math.max(result,max);
        }

        return result;
        
    }
}