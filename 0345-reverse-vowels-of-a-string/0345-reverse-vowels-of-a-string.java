class Solution {
   
    static boolean isVowel(char ch){

    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }

    public String reverseVowels(String s) {

        int N = s.length();
        StringBuilder sb = new StringBuilder(s);

        int S = 0;
        int E = N-1;

           while (S < E) {
                     while (S < E && !isVowel(sb.charAt(S))) S++;
                     while (S < E && !isVowel(sb.charAt(E))) E--;

                    char temp = sb.charAt(S);
                    sb.setCharAt(S, sb.charAt(E));
                    sb.setCharAt(E, temp);

                    S++;    
                    E--;
                }

           return sb.toString();
        }
        
    }
