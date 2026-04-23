class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Long,Integer> map = new HashMap<>();

        int N = nums.length;

        long psum[] = new long[N];
        psum[0] = nums[0];

        for(int i=1;i<N;i++)
         psum[i] = psum[i-1]+nums[i];

         int count = 0;

         for(int i=0;i<N;i++){

            if(psum[i]==k)
             count++;

            count+=map.getOrDefault(psum[i]-k,0);

            map.put(psum[i],map.getOrDefault(psum[i],0)+1); 
         }        

         return count;
    }
}