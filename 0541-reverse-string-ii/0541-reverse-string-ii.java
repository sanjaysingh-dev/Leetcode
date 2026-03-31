class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int N = arr.length;

        for (int i=0;i<N;i+=2*k) {
            int S = i;
            int E = Math.min(i+k-1,N-1);

            while (S<E) {
                char temp = arr[S];
                arr[S] = arr[E];
                arr[E] = temp;
                S++;
                E--;
            }
        }

        return new String(arr);
        
    }
}