class Solution {
    public String removeOuterParentheses(String s) {

        String ans = "";
        int l = 0;

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch=='('){

                if(l>0)
                 ans+=ch;

                l++; 
            }

            else {
                
                l--;

                if(l>0)
                 ans+=ch;
            }
        }

        return ans;
        
    }
}