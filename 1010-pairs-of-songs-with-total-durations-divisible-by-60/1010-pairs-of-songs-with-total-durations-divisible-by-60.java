class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        int N = time.length;
        int count = 0;

        int freq[] = new int[60];

        for(int i=0;i<N;i++){

            time[i] = time[i]%60;

            int pair = 60-time[i];

            if(time[i]==0)
             pair = 0;

            count+=freq[pair];

            freq[time[i]]+=1; 
        }

        return count;
        
    }
}