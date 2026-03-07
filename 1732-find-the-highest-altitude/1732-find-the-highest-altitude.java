class Solution {
    public int largestAltitude(int[] gain) {

        int N = gain.length;
        int psum[] = new int[N+1];

        psum[0] = 0;

        for(int i=1;i<=N;i++)
          psum[i] = psum[i-1]+gain[i-1];

        int max = 0;

        for(int i=0;i<=N;i++)
         max = Math.max(max,psum[i]);

         return max;  
    }
}