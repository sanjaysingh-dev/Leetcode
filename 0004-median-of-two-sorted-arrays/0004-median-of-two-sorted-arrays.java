class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      if (nums1.length > nums2.length) 
            return findMedianSortedArrays(nums2, nums1);

        int N = nums1.length;
        int M = nums2.length;

        int low = 0;
        int high = N;

        while(low<=high){

            int cut1 = (low+high)/2;
            int cut2 = (N+M+1)/2 - cut1;

            int l1 = (cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
            int l2 = (cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];

            int r1 = (cut1==N)?Integer.MAX_VALUE:nums1[cut1];
            int r2 = (cut2==M)?Integer.MAX_VALUE:nums2[cut2];

            if(l1<=r2 && l2<=r1){

                if((N+M)%2==0)
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                
                else 
                    return Math.max(l1,l2);
            }

            else if(l1>r2)
               high = cut1-1;

            else 
              low = cut1+1;   
            }

           return -1; 
        
    }
}