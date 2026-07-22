class Solution {
    public int strStr(String haystack, String needle) {

        int N = haystack.length();
        int M = needle.length();

        if(M>N)
         return -1;

        for(int i=0;i<=N-M;i++){
            
           int j=0;

           while(j<M && haystack.charAt(i+j)==needle.charAt(j))
            j++;

           if(j==M)
            return i;  
        }

        return -1;
        
    }
}