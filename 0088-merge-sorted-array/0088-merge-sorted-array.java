class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int C[] = new int[n+m];
        int p1=0, p2=0, k=0;

        while(p1<m && p2<n){
            if(nums1[p1] < nums2[p2]){
                C[k] = nums1[p1];
                p1++;
                k++;
            }

            else{
                C[k] = nums2[p2];
                p2++;
                k++;
            }
        }

        while(p1<m){
            C[k] = nums1[p1];
            p1++;
            k++;
        }

        while(p2<n){
            C[k] = nums2[p2];
            p2++;
            k++;
        }

         for(int i=0;i<C.length;i++)
          nums1[i] = C[i];
    }
}