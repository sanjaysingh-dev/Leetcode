class Solution {
    public String longestPalindrome(String s) {

        int N = s.length();
        int l=0,r=0,ans=0,start=0;

        for(int i=0;i<N;i++){

            l=i;
            r=i;

            while(l>=0 && r<N){
                if(s.charAt(l)!=s.charAt(r))
                  break;

               if(r-l+1>ans){
                ans = r-l+1;
                start = l;
               }   

                l--;
                r++;  
            }

            l=i;
            r=i+1;

            while(l>=0 && r<N){
                if(s.charAt(l)!=s.charAt(r))
                 break;

                if(r-l+1>ans){
                    ans = r-l+1;
                    start = l;
                }
                  
                l--;
                r++;  
            }
        }

        return s.substring(start,start+ans);
    }
}