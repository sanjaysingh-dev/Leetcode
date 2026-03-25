class Solution {
    public int majorityElement(int[] nums) {

        int N = nums.length;

        if(N==1)
          return nums[0];

        int first = 0;
        int count1 = 0;

        for(int i=0;i<N;i++){
            if(nums[i]==first)
             count1++;

            else if(count1==0){
                first = nums[i];
                count1 = 1;
            }

            else
              count1--;
        }  

        count1 = 0;

        for(int i=0;i<N;i++){
            if(nums[i]==first)
               count1++;
        }
        
        if(count1 > N/2)
          return first;

        else 
        return -1;  
    }
}