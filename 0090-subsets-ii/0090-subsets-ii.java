class Solution {

    List<List<Integer>> ans;

    public void sub(int arr[],int idx, int N,List<Integer> list){

        ans.add(new ArrayList<>(list));

        for(int i=idx;i<N;i++){

            if(i>idx && arr[i]==arr[i-1])
             continue;

            list.add(arr[i]);
            sub(arr,i+1,N,list);
            list.remove(list.size()-1); 
        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {

      int N = nums.length;
      ans = new ArrayList<>();
      List<Integer> list = new ArrayList<>();  
      Arrays.sort(nums);
      
      sub(nums,0,N,list);
      return ans;  
        
    }
}