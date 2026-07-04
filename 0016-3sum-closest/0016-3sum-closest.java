class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int N = nums.length;
        Arrays.sort(nums);

        int Csum = nums[0]+nums[1]+nums[2];

        for(int i=0;i<N;i++){

            if(i>0 && nums[i]==nums[i-1])
             continue;

            int j = i+1;
            int k = N-1;

            while(j<k){

                int sum = nums[i]+nums[j]+nums[k];

                if(sum == target)
                 return sum;

                if(Math.abs(target-sum)<Math.abs(target-Csum))
                    Csum = sum;

                if(sum>target)
                 k--;

                else
                 j++;  
            } 
        }

        return Csum;
        
    }
}