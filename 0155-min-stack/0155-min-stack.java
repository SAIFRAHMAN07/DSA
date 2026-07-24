class MinStack {
    Stack <Integer> stack = new Stack<>();
    Stack <Integer> minstack = new Stack<>();
    
    public MinStack() 
    {   
    }
    
    public void push(int value) 
    {
        int min = Integer.MAX_VALUE;
        if(stack.isEmpty())
        {
            stack.push(value);
            minstack.push(value);
        }
        else
        {
             min = Math.min(minstack.peek(),value);
            stack.push(value);
            minstack.push(min);

        }
        
    }
    
    public void pop() 
    {
        minstack.pop();
        stack.pop();
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