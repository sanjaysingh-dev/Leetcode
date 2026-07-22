class Solution {

    public String newTerm(String s){

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i<s.length()){

            int j=i;

            while(j<s.length() && s.charAt(j)==s.charAt(i))
             j++;

            sb.append(j-i);
            sb.append(s.charAt(i));

            i=j;
        }

        return sb.toString();
    }

    public String countAndSay(int n) {

        String ans = "1";

        for(int i=2;i<=n;i++)
         ans = newTerm(ans);

         return ans;
        
    }
}