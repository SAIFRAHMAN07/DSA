class Solution {
    public int evalRPN(String[] tokens)
    {
        Stack <Integer> stack = new Stack<>();

        for(String i : tokens)
        {        
            if(!i.equals("+") &&!i.equals("*") &&!i.equals("/") &&!i.equals("-") )
            {
                int a = Integer.parseInt(i);
                stack.push(a);
            }
            else
            {
                if(i.equals("+"))
                {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a+b);
                }
                else if(i.equals("*"))
                {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a*b);
                }
                else if(i.equals("-"))
                {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b-a);      
                }
                else
                {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);                
                }
            }
        }
        return stack.pop();
        
    }
}