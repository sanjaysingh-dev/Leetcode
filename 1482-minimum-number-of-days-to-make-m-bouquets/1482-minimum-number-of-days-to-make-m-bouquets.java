class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        int N = bloomDay.length;

        if(N<(long)m*k)
          return -1;

        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;

        for(int i=0;i<N;i++){
         min = Math.min(min,bloomDay[i]);   
         max = Math.max(max,bloomDay[i]);
        }  

        int low = min, high = max, ans = -1;   

        while(low<=high){

            int mid = low + (high-low)/2;

            if(check(bloomDay,mid,m,k)){
                ans = mid;
                high = mid-1;
            }

            else 
             low = mid +1;
        }  

        return ans;
        
    }

    public boolean check(int arr[], int d, int m, int k){

        int count = 0;
        int bq = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<=d)
             count++;

            else{
                bq+= count/k;
                count=0;
            } 
        }

        bq+=count/k;

        return bq>=m;
    }
}