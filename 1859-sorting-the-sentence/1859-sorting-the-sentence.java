class Solution {
    public String sortSentence(String s) {

        String words[] = s.split(" ");
        String ans[] = new String[words.length];

        for(String word: words){

            int N = word.length();
            int  idx = word.charAt(N-1)-'1';

            ans[idx] = word.substring(0,N-1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<ans.length;i++){
            sb.append(ans[i]);

            if(i!=ans.length-1)
            sb.append(' '); 
        }

        return sb.toString();
        
    }
}