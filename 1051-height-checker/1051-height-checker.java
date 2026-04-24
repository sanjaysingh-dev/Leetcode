class Solution {
    public int heightChecker(int[] heights) {

        int N = heights.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<N;i++)
         max = Math.max(max,heights[i]);

        int freq[] = new int[max+1];

        for(int i=0;i<N;i++)
         freq[heights[i]]++;

        int result[] = new int[N];
        int index = 0;

        for(int i=0;i<=max;i++){
            int count = freq[i];
             for(int j=1;j<=count;j++){
                result[index++] = i;
             }
        } 

        int count = 0;

        for(int i=0;i<N;i++){
            if(heights[i]!=result[i])
             count++;
        } 

        return count;
        
    }
}