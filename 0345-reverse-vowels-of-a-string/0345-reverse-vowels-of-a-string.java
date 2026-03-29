class Solution {
    public String reverseVowels(String s) {
    
    ArrayList<Character> vowels = new ArrayList<>();
    Collections.addAll(vowels,'a','e','i','o','u','A','E','I','O','U');
           
        char[] arr = s.toCharArray();
        int S = 0, E = arr.length - 1;

        while (S<E) {

            while (S<E && !vowels.contains(arr[S])) S++;
            while (S<E && !vowels.contains(arr[E])) E--;

            char temp = arr[S];
            arr[S] = arr[E];
            arr[E] = temp;

            S++;
            E--;
        }

        return new String(arr);
        
    }
}