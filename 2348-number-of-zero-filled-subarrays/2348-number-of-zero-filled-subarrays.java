class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long ans = 0;
        long count = 0;
        long subArray = 0;

        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0)
             count++;

            else{
                subArray = count*(count+1)/2;
                ans+=subArray;
                count = 0;
            } 
        }

        subArray = count*(count+1)/2;
        ans+=subArray;

            return ans;        
    }
}