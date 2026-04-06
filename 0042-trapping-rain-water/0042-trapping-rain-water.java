class Solution {
    public int trap(int[] height) {

        int N = height.length;
        
        int psum[] = new int[N];
        psum[0] = height[0];
        
        for(int i=1;i<N;i++)
          psum[i] = Math.max(psum[i-1],height[i]);

        int ssum[] = new int[N];
        ssum[N-1] = height[N-1];

        for(int i=N-2;i>=0;i--)
          ssum[i] = Math.max(ssum[i+1],height[i]);

        int ans = 0;

        for(int i=0;i<N;i++){

           int lmax = psum[i];
           int rmax = ssum[i];

           int h = Math.min(lmax,rmax);
           int amount = h - height[i];
           ans+= amount;
        }       

        return ans;
    }
}