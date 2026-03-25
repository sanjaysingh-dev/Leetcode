class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int N = nums.length;
        List<Integer> ans = new ArrayList<>(); 

        int first = 0;
        int second = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<N;i++){

            if(nums[i]==first)
              count1++;

            else if(nums[i]==second)
              count2++;

            else if(count1==0){
                first = nums[i];
                count1 = 1;
            }    

            else if(count2==0){
                second = nums[i];
                count2++;
            }

            else{
                count1--;
                count2--;
            }
        }

        count1 = 0; 
        count2 = 0;

        for(int i=0;i<N;i++){
            if(nums[i]==first)
             count1++;

            else if(nums[i]==second)
            count2++; 
        }

        if(count1 > N/3)
          ans.add(first);

        if(count2 > N/3)
          ans.add(second);

         return ans; 
    }
}