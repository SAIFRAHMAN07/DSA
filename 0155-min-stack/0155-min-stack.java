class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) 
    {
        if(stack.isEmpty())
        {
            stack.push(value);
            minstack.push(value);
        }
        else
        {
            int ans = Math.min(value,minstack.peek());
            minstack.push(ans);
            stack.push(value);
        }
    }
    
    public void pop() 
    {
        stack.pop();
        minstack.pop();
    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin() 
    {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */