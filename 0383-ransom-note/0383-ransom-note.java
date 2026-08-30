class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        if(magazine.length()<ransomNote.length())
        {
            return false;
        }
        for(int i =0 ;i<magazine.length(); i++)
        {
            char ch = magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0 ; j<ransomNote.length();j++)
        {
            char ch = ransomNote.charAt(j);
            if(map.getOrDefault(ch,0)>0)
            {
                map.put(ch,map.get(ch)-1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}