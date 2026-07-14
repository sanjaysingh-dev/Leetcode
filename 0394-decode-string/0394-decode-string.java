class Solution {
    public String decodeString(String s) {

        Stack<Integer> numSt = new Stack<>();
        Stack<StringBuilder> stringSt = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num = 0;

        char arr[] = s.toCharArray();

        for(int i=0;i<arr.length;i++){

            char ch = arr[i];

            if(Character.isDigit(ch))
             num = num*10+(ch-'0');

            else if(ch =='['){

                numSt.push(num);
                stringSt.push(curr);

                num = 0;
                curr = new StringBuilder();
            }

            else if(ch==']'){
                int rep = numSt.pop();
                StringBuilder prev = stringSt.pop();

                for(int j=0;j<rep;j++)
                 prev.append(curr);

                 curr=prev;
            }

            else 
              curr.append(ch);
        }

        return curr.toString();

        
    }
}