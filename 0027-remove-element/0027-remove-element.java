class Solution {
    public int removeElement(int[] nums, int val) {

        int N = nums.length;

        int i = 0;
        int j = 0;

        while(j<N){
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
        
    }
}