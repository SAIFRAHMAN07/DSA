class Solution {
    public int maximumProduct(int[] nums) 
    {
    
       Arrays.sort(nums);
       int a= nums.length;
       int max = nums[a-1]*nums[a-2]*nums[a-3];
       int max2 = nums[0]*nums[1]*nums[a-1];
       int ans = Math.max(max,max2);
       return ans;    
    }
}