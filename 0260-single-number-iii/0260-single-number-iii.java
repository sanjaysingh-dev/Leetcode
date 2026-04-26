class Solution {
    public int[] singleNumber(int[] nums) {

        int N = nums.length;
        int xor = 0;

        for(int i=0;i<N;i++)
         xor = xor^nums[i];

         int index = 0;

          while ((xor & (1 << index)) == 0) {
            index++;
        }

         int xorUnset = 0;
         int xorSet = 0;

         for(int i=0;i<N;i++){
            if((nums[i]&(1<<index))==0)
              xorUnset^=nums[i];

             else 
              xorSet^=nums[i]; 
         }

         int ans[] = new int[2];
         ans[0] = Math.min(xorUnset,xorSet);
         ans[1] = Math.max(xorUnset,xorSet);

         return ans;
        
    }
}