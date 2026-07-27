class Solution {
    public String removeKdigits(String num, int k) 
    {
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char ch = num.charAt(i);
            while(!stack.isEmpty() && ch < stack.peek() && k!=0)
            {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while (k > 0) 
            {
                stack.pop();
                k--;
            }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If everything is removed
        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }
}