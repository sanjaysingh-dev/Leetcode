class Solution {
    public int nthMagicalNumber(int n, int a, int b) {

        long low = 1;
        long high = (long)Math.min(a,b)*n;
        long ans = -1;
        long mod = 1000000007;

        while(low<=high){

            long mid = low + (high-low)/2;

            if(check(mid,a,b)>=n){
                ans = mid;
                high = mid - 1;
            }

            else 
              low = mid + 1;
        }

        return (int)(ans%mod);
        
    }

    public long check(long mid, long a, long b){

        long lcm = (a*b)/gcd(a,b);

        return (mid/a)+(mid/b)-(mid/lcm);
    }

    public long gcd(long A, long B){

        if(B==0)
         return A;

         return gcd(B,A%B); 
    }
}