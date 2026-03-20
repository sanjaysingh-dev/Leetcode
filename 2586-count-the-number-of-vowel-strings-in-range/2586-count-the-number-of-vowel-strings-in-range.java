class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int count = 0;

        for(int i=left;i<=right;i++){

            String S = words[i].toLowerCase();
            char f = S.charAt(0);
            char l = S.charAt(S.length()-1);

            if((f =='a' || f=='e' || f=='i' || f=='o' || f=='u') &&
               (l =='a' || l=='e' || l=='i' || l=='o' || l=='u'))
                count++;
        }

        return count;
    }
}