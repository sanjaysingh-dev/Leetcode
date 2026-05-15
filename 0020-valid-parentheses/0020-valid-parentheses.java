class Solution {

    public boolean isCompatible(char ob, char cb){

        if(ob =='(' && cb ==')')
          return true;

        else if(ob == '{' &&  cb=='}') 
          return true;

        else if(ob =='[' && cb ==']')
          return true;

        else 
        return false;     
    }


    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
              st.push(ch);

            else{
                if(st.size()==0)
                   return false;

                else if(isCompatible(st.peek(),ch)==false)
                 return false;

                else 
                 st.pop();    
            }  
        }

        if(st.size()==0)
         return true;

        else 
         return false; 
        
    }
}