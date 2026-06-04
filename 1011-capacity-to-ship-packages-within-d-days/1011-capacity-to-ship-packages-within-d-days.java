class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int N = weights.length;
        int sum = 0;

        for(int i=0;i<N;i++)
         sum+=weights[i];

        int low = 1;
        int high = sum;
        int ans = -1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(check(weights,mid,days)){
                ans = mid;
                high = mid - 1;
            }

            else 
             low = mid + 1;
        } 
        
        return ans;
    }

    public boolean check(int A[], int capacity, int d){

    int usedDays = 1;
    int currentLoad = 0;

    for(int i=0;i<A.length;i++){

        if(A[i] > capacity)
            return false;

        if(currentLoad + A[i] > capacity){
            usedDays++;
            currentLoad = A[i];
        }
        else{
            currentLoad += A[i];
        }
     }

     return usedDays <= d;

    }
}