class Solution {
    public String largestOddNumber(String num) {
        
        int idx = -1;
        int N = num.length();
        int i;

        for(i=N-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                idx = i;
                break;
            }
        }

        if(idx == -1)
         return "";

        i=0;

        while(i<=idx && num.charAt(i)=='0')
         i++;

        return num.substring(i,idx+1);  
    }
}