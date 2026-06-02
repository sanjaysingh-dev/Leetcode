class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int N = nums.length;
        Stack<Integer> stack = new Stack<>();
        int nge[] = new int[N];

        for(int i=2*N-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()<=nums[i%N])
             stack.pop();

            if(i<N){

                if(stack.isEmpty())
                  nge[i] = -1;

                else 
                 nge[i] = stack.peek();  
            }

            stack.push(nums[i%N]); 
        }

        return nge;
        
    }
}