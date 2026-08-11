class Solution {
    public int missingInteger(int[] nums) 
    {
        HashSet<Integer>set = new HashSet<>();
        int sum =0,a=0;
        a=1;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                sum = sum + nums[i];
                a++;   
            }   
            
            else{
                break;
            }
        }
        sum = sum+nums[0];
        for(int num : nums)
        {
            set.add(num);
        }
        while(set.contains(sum))
        {
            sum++;
        }
        return sum;
        //done
    }
}