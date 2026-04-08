class Solution {
    public int singleNumber(int[] nums) {

        int N = nums.length;
        int ans = 0;

        for(int i=0;i<N;i++)
            ans = ans^nums[i];
        

        return ans;
        
    }
}