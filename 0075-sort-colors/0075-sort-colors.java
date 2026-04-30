class Solution {
    public void sortColors(int[] nums) {

        mergeSort(nums,0,nums.length-1);
    }

    public void mergeSort(int A[], int s, int e){

        if(s>=e)
         return;

         int m = (s+e)/2;

         mergeSort(A,s,m);
         mergeSort(A,m+1,e);

         merge(A,s,m,e);
    }

    public void merge(int A[], int s, int m, int e){
        int C[] = new int[e-s+1];
        int p1=s, p2=m+1, k=0;

        while(p1<=m && p2<=e){
            if(A[p1]<A[p2]){
                C[k] = A[p1];
                p1++;
                k++;
            }

            else{
                C[k] = A[p2];
                p2++;
                k++;
            }
        }

        while(p1<=m){
            C[k] = A[p1];
            p1++;
            k++;
        }

        while(p2<=e){
            C[k] = A[p2];
            p2++;
            k++;
        }

        for(int i=0;i<C.length;i++)
         A[s+i] = C[i];
    }
}
