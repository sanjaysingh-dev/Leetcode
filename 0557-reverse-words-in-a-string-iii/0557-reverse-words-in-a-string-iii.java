class Solution {

    public String reverseWords(String s) {

        String result[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        int N = result.length;

        for(int i=0;i<N;i++){
           sb.append(new StringBuilder(result[i]).reverse());
            if(i<N-1)
              sb.append(" ");
        }   

            return sb.toString();        
    }
}