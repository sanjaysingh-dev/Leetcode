class Solution {
    public int[] searchRange(int[] nums, int target) {

       int fpos = -1;
       int lpos = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(fpos==-1 )
                   fpos = i;

                lpos = i;   
            }
        }
   
        int ans[] ={fpos,lpos};
        return ans;
    }
}