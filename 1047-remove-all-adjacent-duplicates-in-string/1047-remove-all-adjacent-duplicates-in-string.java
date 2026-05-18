class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(stack.isEmpty() || stack.peek()!=s.charAt(i))
              stack.push(s.charAt(i));

            else 
             stack.pop();  
        }

        StringBuilder sb = new StringBuilder();

        for(char ch: stack)
          sb.append(ch);

          return sb.toString();
    }
}