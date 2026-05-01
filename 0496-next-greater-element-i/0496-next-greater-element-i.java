class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int N = nums1.length;
        int M = nums2.length;

        int ans[] = new int[N];

        for(int i=0;i<N;i++){

            int j = 0;

            while(nums2[j]!=nums1[i])
             j++;

            int gelement = -1;

            for(int k=j+1;k<M;k++){
                if(nums2[k]>nums1[i]){
                    gelement = nums2[k];
                    break;
                }
            }
            
            ans[i] = gelement;
        }

        return ans;
        
    }
}