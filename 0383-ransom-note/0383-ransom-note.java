class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int N = ransomNote.length();
        int M = magazine.length();

        if(M<N)
          return false;

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i=0;i<N;i++)
          freq1[ransomNote.charAt(i)-'a']++;

        for(int i=0;i<M;i++)
          freq2[magazine.charAt(i)-'a']++;  

         for(int i=0;i<26;i++){
            if(freq2[i]<freq1[i])
              return false;
         }
        
        return true;
    }
}