class Solution {
    public int firstUniqChar(String s) {

        int N = s.length();
        int freq[] = new int[26];

        for(int i=0;i<N;i++)
          freq[s.charAt(i)-'a']++;

        for(int i=0;i<N;i++){
            if(freq[s.charAt(i)-'a']==1)
               return i;
        }  
        
       return -1;
    }
}