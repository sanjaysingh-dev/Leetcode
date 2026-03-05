class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        int N = s.length();

        for(int i=0;i<N;i++){
            char ch = s.charAt(i);

            if((ch>='A' && ch<='Z') || 
               (ch>='a' && ch<='z') ||
               (ch>='0' && ch<='9')){
 
               if(ch>='A' && ch<='Z')
                  ch = (char)(ch+32);

                sb.append(ch);
              }
        }   

        String str = sb.toString();
        String rev = sb.reverse().toString();

        return str.equals(rev);   
    }
}