class Solution {
    public int maximalRectangle(char[][] matrix) {

        int N = matrix.length;
        int M = matrix[0].length;

        int maxArea = 0;
        int height[] = new int[M];

        for(int i=0;i<N;i++){

            for(int j=0;j<M;j++){

                if(matrix[i][j]=='0')
                 height[j] = 0;

                else 
                 height[j]+=1; 
            }

            maxArea = Math.max(maxArea,largestHistogram(height));
        }

        return maxArea;
        
    }

    public int largestHistogram(int arr[]){

        int N = arr.length;

        Stack<Integer> stack = new Stack<>();
        int left[] = new int[N];
        int right[] = new int[N];

        for(int i=0;i<N;i++){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
             stack.pop();

            if(stack.isEmpty())
             left[i] = -1;

            else 
             left[i] = stack.peek();  

             stack.push(i);
        } 

        stack.clear();

        for(int i=N-1;i>=0;i--){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
             stack.pop();

            if(stack.isEmpty())
             right[i] = N;

            else 
             right[i] = stack.peek();

            stack.push(i);   
        }

        int ans = 0;

        for(int i=0;i<N;i++){

            int p1 = left[i];
            int p2 = right[i];
            int w = p2-p1-1;

            ans = Math.max(ans,arr[i]*w);
        }

        return ans;
    }
}