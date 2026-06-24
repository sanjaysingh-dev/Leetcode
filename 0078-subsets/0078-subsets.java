class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
       List<Integer> small = new ArrayList<>();
       List<List<Integer>> ans = new ArrayList<>();

       subset(nums,small,ans,0);

       return ans; 

    }

    public void subset(int A[], List<Integer> small, List<List<Integer>> ans, int idx){

        if(idx == A.length){
            ans.add(new ArrayList<>(small));
            return;
        }

        small.add(A[idx]);

        subset(A,small,ans,idx+1);

        small.remove(small.get(small.size()-1));

        subset(A,small,ans,idx+1);
    }
}