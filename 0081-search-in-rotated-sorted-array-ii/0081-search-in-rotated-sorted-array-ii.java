class Solution {
    public boolean search(int[] nums, int target) {

        int N = nums.length;
        int low = 0, high = N-1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(nums[mid]==target)
             return true;

           else if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low = low+1;
                high = high-1;
                continue;
            }

          else if(nums[low]<=nums[mid]){

            if(target>=nums[low] && target<nums[mid])
             high = mid -1;

            else 
             low = mid +1; 
          }

          else{

            if(target>nums[mid] && target<=nums[high])
             low = mid +1;

            else 
             high = mid -1; 
          }  
      }
       
       return false;
        
    }
}