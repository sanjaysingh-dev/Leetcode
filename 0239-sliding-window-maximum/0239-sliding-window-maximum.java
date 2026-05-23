class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        int N = nums.length;
        int ans[] = new int[N-k+1];
        
        for(int i=0;i<k;i++){

            while(dq.size()>0 && nums[i]>dq.getLast())
             dq.removeLast();

            dq.addLast(nums[i]); 
        }

        int idx = 0;
        
        ans[idx++] = dq.getFirst();

        int s = 1;
        int e = k;

        while(e<N){

            if(nums[s-1]==dq.getFirst())
             dq.removeFirst();

             while(dq.size()>0 && nums[e]>dq.getLast())
              dq.removeLast();

             dq.addLast(nums[e]);
             ans[idx++] = dq.getFirst();
             s++;
             e++; 
        }

        return ans;

    }
}