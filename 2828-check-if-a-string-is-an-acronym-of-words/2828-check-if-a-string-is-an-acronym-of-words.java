class Solution {
    public boolean isAcronym(List<String> words, String s) {
 
      int N = words.size();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++)
            sb.append(words.get(i).charAt(0));
        
        return sb.toString().equals(s);
    }
}