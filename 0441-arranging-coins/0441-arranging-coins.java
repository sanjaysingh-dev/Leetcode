class Solution {
    public int arrangeCoins(int n) {

        int low = 1, high = n, ans = 0;

        while(low<=high){
            int mid = low +(high-low)/2;
            long h = (long) mid*(mid+1)/2;

            if(h==n)
             return mid;

            else if(h>n)
             high = mid - 1;

            else{
                ans = mid;
                low = mid + 1;
            } 
        }

        return ans;
        
    }
}