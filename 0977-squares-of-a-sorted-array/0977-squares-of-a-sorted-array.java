class Solution {
    public int[] sortedSquares(int[] nums) {

        int N = nums.length;
        int ans[] = new int[N];

        int i=0;
        int j=N-1;
        int idx = N-1;

        while(i<=j){

            int lsq = nums[i]*nums[i];
            int rsq = nums[j]*nums[j];

            if(lsq>rsq){
                ans[idx] = lsq;
                i++;
             }

            else{
                ans[idx] = rsq;
                j--;
            } 

            idx--;
        }

        return ans;
        
    }
}