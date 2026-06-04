class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int N = piles.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<N;i++)
         max = Math.max(max,piles[i]);

        int low = 1;
        int high = max;

        int ans = -1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(check(piles,mid,h)){
                ans = mid;
                high = mid - 1;
            }

            else 
             low = mid + 1;

        } 

        return ans;
        
    }

    public boolean check(int A[], int speed, int h){
        
        long TL = 0;

        for(int i=0;i<A.length;i++)
         TL+=(A[i]+speed-1)/speed;

        return TL<=h;  
    }
}