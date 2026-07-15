class Solution {
    public List<String> commonChars(String[] words) {

        int N = words.length;

        int g[] = new int[26];
        Arrays.fill(g,Integer.MAX_VALUE);

        int l[] = new int[26];

        for(int i=0;i<N;i++){

            Arrays.fill(l,0);

            for(char ch: words[i].toCharArray())
              l[ch-'a']++;

            for(int j=0;j<26;j++)
             g[j] = Math.min(g[j],l[j]);  
        }

        List<String> ans = new ArrayList<>();

        for(int i=0;i<26;i++){
            if(g[i]>0){
                while(g[i]>0){
                    ans.add(Character.toString((char)(i+'a')));
                    g[i]--;
                }
            }
        }

        return ans;
        
    }
}