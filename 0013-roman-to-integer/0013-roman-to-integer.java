class Solution {

    private int val(char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }
    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int curr=val(s.charAt(i));
            int next=val(s.charAt(i+1));
            if(next>curr)
            {
                total-=curr;
            }
            else
            {
                total+=curr;
            }
        }
        return total=total+val(s.charAt(s.length()-1));
    }
}
         