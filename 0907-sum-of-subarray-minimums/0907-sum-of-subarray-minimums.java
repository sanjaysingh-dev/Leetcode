class Solution {
    public int sumSubarrayMins(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int N = arr.length;

        int pse[] = new int[N];
        int nse[] = new int[N];

        for(int i=0;i<N;i++){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
              stack.pop();

            if(stack.isEmpty())
             pse[i] = -1;

            else 
            pse[i] = stack.peek();

            stack.push(i);   
        }

        stack.clear();

        for(int i=N-1;i>=0;i--){

            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
             stack.pop();

            if(stack.isEmpty())
             nse[i] = N;

            else 
             nse[i] = stack.peek();  

             stack.push(i);
        }

        long ans = 0;
        long mod = 1000000007;

        for(int i=0;i<N;i++){
            long minCount =(long)(i-pse[i])*(nse[i]-i);
            long count = ((long)arr[i]*minCount)%mod;
             ans = (ans+count)%mod;
        }

        return (int)ans;

    }
}