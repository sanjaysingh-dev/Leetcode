class Solution {
    public int[] productExceptSelf(int[] nums) {

        int N = nums.length;
        int[] psum = new int[N];
        int[] ssum = new int[N];
        int[] answer = new int[N];

        psum[0] = 1;   
        for (int i=1;i<N;i++)
            psum[i] = psum[i-1]*nums[i-1];

        ssum[N-1] = 1;  
        for (int i=N-2;i>=0;i--)
            ssum[i] = ssum[i+1]*nums[i+1];

        for (int i=0;i<N;i++)
            answer[i] = psum[i]*ssum[i];

        return answer;
        
    }
}