class Solution {
    public String restoreString(String s, int[] indices) {

        int N = indices.length;
        char arr[] = new char[N];

        for(int i=0;i<N;i++)
           arr[indices[i]] = s.charAt(i); 

          return String.valueOf(arr); 
    }
}