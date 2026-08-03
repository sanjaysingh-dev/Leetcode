class Solution {
    List<List<Integer>> ans;

    public void sum(int arr[], int idx, int n, int sum, List<Integer> list){

        if(idx==n){
            if(sum==0)
                ans.add(new ArrayList<>(list));
            
            return;
        }

        if(arr[idx]<=sum){
            list.add(arr[idx]);
            sum(arr,idx,n,sum-arr[idx],list);
            list.remove(list.size()-1);
        }

        sum(arr,idx+1,n,sum,list);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

      ans = new ArrayList<>();
      List<Integer> list = new ArrayList<>();
      int N = candidates.length;

      sum(candidates,0,N,target,list);
      return ans;  
        
    }
}