class Solution {
    public String simplifyPath(String path) 
    {
        Stack <String> stack = new Stack<>();
        String[] folders = path.split("/");
        
        for(String fold : folders)
        {
            if(fold.equals("."))
            {            }
            else if(fold.equals(".."))
            {
                if(stack.isEmpty())
                {
                }
                else
                stack.pop();
            }
            else if(fold.equals(""))
            {     
            
                   }
            else
            {
                stack.push(fold);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (String dir : stack) {
        sb.append("/");
        sb.append(dir);
        }
       if (sb.length() == 0) {
    return "/";
}
return sb.toString();
    }
}