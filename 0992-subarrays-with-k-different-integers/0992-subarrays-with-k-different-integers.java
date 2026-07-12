class Solution {
    
    public int subWithAtleastK(int arr[], int N, int k){

        int j=0,count=0,dist=0;

        int freq[] = new int[N+1];

        for(int i=0;i<N;i++){

            while(j<N && dist<k){

                freq[arr[j]]++;
             
                if(freq[arr[j]]==1)
                 dist++;

                j++; 
            }

            if(dist>=k)
             count+=N-j+1;

            freq[arr[i]]--;

            if(freq[arr[i]]==0)
             dist--; 
        }

        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {

        int N = nums.length;
        return subWithAtleastK(nums,N,k)-subWithAtleastK(nums,N,k+1);
        
    }
}