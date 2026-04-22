class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int st = 0;
        int e = 0;
        int max = 0;

        while(e<s.length()){
            char ch = s.charAt(e);

            if(!set.contains(ch)){
                set.add(ch);
                max = Math.max(max,e-st+1);
                e++;
            }

            else{
                set.remove(s.charAt(st));
                st++;
            }
        }

        return max;
    }
}