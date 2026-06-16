class Solution {
    public int[] rearrangeArray(int[] nums) {

        int N = nums.length;
        int pindex = 0;
        int nindex = 1;

        int ans[] = new int[N];

        for(int i=0;i<N;i++){

            if(nums[i]<0){
                ans[nindex] = nums[i];
                nindex+=2;
            }

            else{
                ans[pindex] = nums[i];
                pindex+=2;
            }
        }

        return ans;
        
    }
}