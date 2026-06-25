class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        
        int N = nums.length;
        boolean visited[] = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();

        permute(nums,curr,visited);
        return ans;
    }

    public void permute(int A[], List<Integer> curr, boolean visited[]){

        if(curr.size()==A.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<A.length;i++){

            if(visited[i] == false){

                visited[i] = true;
                curr.add(A[i]);

                permute(A,curr,visited);

                visited[i] = false;
                curr.remove(curr.size()-1);
            }
        }
    }
}