class Solution {
    public int pivotInteger(int n) {

        int psum[] = new int[n+1];
        psum[0] = 0;

        for(int i=1;i<=n;i++)
           psum[i] = psum[i-1]+i;

       int ssum[] = new int[n+2];
       ssum[n] = n;

       for(int i=n-1;i>=1;i--)
         ssum[i] = ssum[i+1]+i;

       for(int i=1;i<=n;i++){
        if(psum[i]==ssum[i])
          return i;
       }      

     return -1;  
        
    }
}