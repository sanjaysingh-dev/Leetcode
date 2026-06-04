class Solution {
    public int[] searchRange(int[] nums, int target) {

        int fpos = firstOcc(nums,target);
        int lpos = lastOcc(nums,target);

        return new int[]{fpos,lpos};

    } 

   public int firstOcc(int nums[], int target){

        int low = 0;
        int high = nums.length - 1;

        int ans = -1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                ans = mid;
                high = mid -1;
            }

            else if(target>nums[mid])
             low = mid+1;

            else 
             high = mid-1; 
        
    }
    return ans;
}

public int lastOcc(int nums[], int target){

        int low = 0;
        int high = nums.length - 1;

        int ans = -1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }

            else if(target>nums[mid])
             low = mid+1;

            else 
             high = mid-1; 
        
    }
    return ans;
 }
}