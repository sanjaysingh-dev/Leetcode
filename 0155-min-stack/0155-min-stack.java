class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {
    stack = new Stack<>();
    minstack = new Stack<>();
    }
    
    public void push(int val) {

        stack.push(val);

        if(minstack.size()==0 || val<=minstack.peek())
          minstack.push(val);
        
    }
    
    public void pop() {

        if(stack.size()==0)
         return;

        int num = stack.pop();

        if(num==minstack.peek())
         minstack.pop();
        
    }
    
    public int top() {
        if(stack.size()==0)
         return -1;

         return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */