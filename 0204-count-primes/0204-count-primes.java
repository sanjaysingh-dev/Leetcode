class Solution {
    public int countPrimes(int n) {

        if(n<=2)
         return 0;

        boolean ans[] = new boolean[n];
        ans[0] = true;
        ans[1] = true;

        int count = 0;

        for(int i=2;i*i<n;i++){
           if(ans[i]==false){
            for(int j=i*i;j<n;j+=i)
              ans[j] = true;
           }  
        }

        for(int i=0;i<n;i++){
            if(ans[i]==false)
             count++;
        }

        return count;
        
    }
}