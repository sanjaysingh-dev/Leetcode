class Solution {
     
     int count = 0;

    public void mergeS(int arr[], int s, int e){

        if(s>=e)
         return;

         int mid = (s+e)/2;

         mergeS(arr,s,mid);
         mergeS(arr,mid+1,e);

         countPairs(arr,s,mid,e);
         merge(arr,s,mid,e);
    }

    public void merge(int arr[], int s, int m,int e){

        int C[] = new int[e-s+1];

        int p1=s, p2=m+1, k=0;

        while(p1<=m && p2<=e){

            if(arr[p1]<=arr[p2]){
                C[k] = arr[p1];
                p1++;
                k++;
            }

            else{
                C[k] = arr[p2];
                p2++;
                k++;
            }
        }

        while(p1<=m){
            C[k] = arr[p1];
            p1++;
            k++;
        }

        while(p2<=e){
            C[k] = arr[p2];
            p2++;
            k++;
        }

        for(int i=0;i<C.length;i++)
          arr[s+i] = C[i];

    }

    public void countPairs(int arr[], int s, int m, int e){

        int p2 = m+1;

        for(int i=s;i<=m;i++){
            while(p2<=e && (long)arr[i]>2L*arr[p2])
                 p2++;

               count+= p2-(m+1);     
            }
    }  

    public int reversePairs(int[] nums) {

        int N = nums.length;
        mergeS(nums,0,N-1);
        return count;

    }
}