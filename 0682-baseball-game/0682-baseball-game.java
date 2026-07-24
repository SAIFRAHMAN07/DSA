class Solution {
    public int calPoints(String[] operations) 
    {
        Stack <Integer> stack = new Stack<>();
        //sync test 
        for(String i :  operations)
        {
            if(stack.isEmpty())
            {
                if(!i.equals("C") && !i.equals("+") && !i.equals("D"))
                {
                    int a = Integer.parseInt(i);
                    stack.push(a);
                }
            }
            else
            {
                if(i.equals("C"))
                {
                    stack.pop();
                }
                else if(i.equals("D"))
                {
                    stack.push(2*stack.peek());
                }
                else if(i.equals("+"))
                {
                   int top = stack.pop();
                   int top2 = stack.peek();
                   int sum = top + top2;
                   stack.push(top);
                   stack.push(sum);
                }
                else
                {
                    int a = Integer.parseInt(i);
                    stack.push(a);
                }
            }
        }
            int total =0;
            while(!stack.isEmpty())
            {
                total = total + stack.pop();
            }
        return total;
        
    }
}