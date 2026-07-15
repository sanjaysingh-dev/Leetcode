class Solution {
    public List<String> commonChars(String[] words) {

        int N = words.length;
        int minF[] = new int[26];

        Arrays.fill(minF,Integer.MAX_VALUE);

        for(int i=0;i<N;i++){

            char ch[] = words[i].toCharArray();
            int freq[] = new int[26];

            for(int j=0;j<ch.length;j++)
              freq[ch[j]-'a']++;

            for(int j=0;j<26;j++)
              minF[j] = Math.min(minF[j],freq[j]);  
        }

        List<String> ans = new ArrayList<>();

        for(int i=0;i<26;i++){
            if(minF[i]>0){
                while(minF[i]>0){
                    ans.add(Character.toString((char)(i+'a')));
                    minF[i]--;
                }
            }
        }

        return ans;
        
        
    }
}