class Solution {
    public String reverseWords(String s) {

        StringBuilder res = new StringBuilder();
        int N = s.length();
        int i = N-1;

        while(i>=0){

            while(i>=0 && s.charAt(i)==' ')
             i--;

            if(i<0)
             break;

            int e = i;

            while(i>=0 && s.charAt(i)!=' ')
             i--;

            String word = s.substring(i+1,e+1);

            if(!res.isEmpty())
             res.append(" ");

             res.append(word);   
        }

        return res.toString();
        
    }
}