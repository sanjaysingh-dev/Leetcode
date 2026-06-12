class Solution {
    public int removeDuplicates(int[] nums) {

        int N = nums.length;

        int i=0;
        int j=1;

        while(j<N){
            if(nums[j]!=nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        
        return i+1;
    }
}