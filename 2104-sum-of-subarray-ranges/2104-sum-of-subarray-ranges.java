class Solution {
    public long subArrayRanges(int[] nums) {

        int N = nums.length;

        Stack<Integer> stack = new Stack<>();

        int pge[] = new int[N];
        int nge[] = new int[N];

        int pse[] = new int[N];
        int nse[] = new int[N];

        for(int i=0;i<N;i++){

            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i])
              stack.pop();

             if(stack.isEmpty())
              pge[i] = -1;

             else 
              pge[i] = stack.peek();

              stack.push(i);  
        }

        stack.clear();

        for(int i=N-1;i>=0;i--){

            while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
             stack.pop();

            if(stack.isEmpty())
             nge[i] = N;

            else 
             nge[i] = stack.peek();

             stack.push(i);  
        }

        stack.clear();

        for(int i=0;i<N;i++){

            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i])
             stack.pop();

            if(stack.isEmpty())
             pse[i] = -1;

            else 
             pse[i] = stack.peek();

             stack.push(i);  
        }

        stack.clear();

        for(int i=N-1;i>=0;i--){

            while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
             stack.pop();

             if(stack.isEmpty())
              nse[i] = N;

             else 
              nse[i] = stack.peek();

              stack.push(i); 
        }

        long ans = 0;

        for(int i=0;i<N;i++){

            long maxCount = (i-pge[i])*(nge[i]-i);
            long minCount = (i-pse[i])*(nse[i]-i);

            long count = maxCount - minCount;
            long contri = nums[i]*count;

            ans+=contri;
        }
        
        return ans;
    }
}