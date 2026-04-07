class Solution {
    public void nextPermutation(int[] nums) {

        int N = nums.length;

        if(N==1)
         return;

        int i = N-2;

        while(i>=0 && nums[i]>=nums[i+1])
            i--;

         if(i!=-1){
            for(int j=N-1;j>=i;j--){
                if(nums[j]>nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
         }   

          int s = i+1;
          int e = N-1;

          while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
          }  

    }
 }
