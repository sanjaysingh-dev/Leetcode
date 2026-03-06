class Solution {
    public int pivotIndex(int[] nums) {
        int N = nums.length;

        int psum[] = new int[N];
        psum[0] = 0;

        for(int i=1;i<N;i++)
          psum[i] = psum[i-1]+nums[i-1];

        int ssum[] = new int[N];
        ssum[0] = 0;

        for(int i=N-2;i>=0;i--)
          ssum[i] = ssum[i+1]+nums[i+1];

        for(int i=0;i<N;i++){
            if(psum[i]==ssum[i])
              return i;
        }       

        return -1;
    }
}