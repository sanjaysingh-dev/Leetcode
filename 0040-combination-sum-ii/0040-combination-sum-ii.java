class Solution {

    List<List<Integer>> ans;

    public void sum(int arr[],int idx, int N, int target, List<Integer> list){

        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<N;i++){

            if(i>idx && arr[i]==arr[i-1])
             continue;

            if(arr[i]>target)
             break;

            list.add(arr[i]);
            sum(arr,i+1,N,target-arr[i],list);
            list.remove(list.size()-1);  
        }
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        int N = candidates.length;
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();

        sum(candidates,0,N,target,list);
        return ans;
        
    }
}