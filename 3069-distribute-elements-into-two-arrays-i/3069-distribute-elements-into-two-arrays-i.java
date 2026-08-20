class Solution {
    public int[] resultArray(int[] nums) {

        int N = nums.length;
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        a1.add(nums[0]);
        a2.add(nums[1]);

        for(int i=2;i<N;i++){

            if(a1.get(a1.size()-1) > a2.get(a2.size()-1))
             a1.add(nums[i]);

            else 
             a2.add(nums[i]); 
        }

        int ans[] = new int[N];

        for(int i = 0; i < a1.size(); i++)
             ans[i] = a1.get(i);

        for(int i = 0; i < a2.size(); i++)
            ans[a1.size() + i] = a2.get(i);


         return ans; 
        
    }
}