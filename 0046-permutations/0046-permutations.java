class Solution {
    public void permute(int arr[], int idx, int N, List<List<Integer>> ans){

        if(idx==N){

         List<Integer> list = new ArrayList<>();
          for(int i=0;i<N;i++)
             list.add(arr[i]);

             ans.add(new ArrayList<>(list));
             return;
        }

        for(int i=idx;i<N;i++){

            swap(arr,i,idx);
            permute(arr,idx+1,N,ans);
            swap(arr,idx,i);
        }
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int N = nums.length;
        permute(nums,0,N,ans);   
        return ans;

    }
}