class Solution {
    public int largestRectangleArea(int[] heights) {

        int N = heights.length;

        Stack<Integer> stack = new Stack<>();
        int left[] = new int[N];
        int right[] = new int[N];

        for(int i=0;i<N;i++){

            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
             stack.pop();

            if(stack.isEmpty())
              left[i] = -1; 

            else 
              left[i] = stack.peek();

             stack.push(i);   
        }

        stack.clear();

        for(int i=N-1;i>=0;i--){

            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
              stack.pop();

             if(stack.isEmpty())
               right[i] = N;

             else 
               right[i] =  stack.peek();

               stack.push(i);  
        }

        int ans = 0;

        for(int i=0;i<N;i++){

            int h = heights[i];
            int w = right[i]-left[i]-1;

            ans = Math.max(ans,h*w);
        }

        return ans;
        
    }
}