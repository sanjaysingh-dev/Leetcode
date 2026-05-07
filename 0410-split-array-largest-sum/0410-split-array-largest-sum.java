class Solution {
    public int splitArray(int[] nums, int k) {

        int N = nums.length;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<N;i++){
            max = Math.max(max,nums[i]);
            sum+=nums[i];
        }

        int low = max;
        int high = sum; 
        int ans = -1;

        while(low<=high){

            int mid = low + (high-low)/2;

            int s = MinS(nums,mid);

            if(s<=k){
                ans = mid;
                high = mid - 1;
            }

            else 
             low = mid + 1;
        }

        return ans;
    }

    public int MinS(int A[], int x){
        int s = 1;
        int SL = x;

        for(int i=0;i<A.length;i++){
            int t = A[i];

            if(t>x)
              return -1;

            if(t<=SL)
             SL = SL - t;

            else{
                s++;
                SL = x - t;
            }  
        }

        return s;
    }
}