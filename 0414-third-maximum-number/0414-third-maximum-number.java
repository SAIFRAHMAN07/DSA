class Solution {
    public int thirdMax(int[] nums) {

        long largest = nums[0];
        long slargest = Long.MIN_VALUE;
        long tlargest = Long.MIN_VALUE;

        for(int i = 1; i < nums.length; i++) {

            if(largest < nums[i]) {
                tlargest = slargest;
                slargest = largest;
                largest = nums[i];
            }
            else if(nums[i] < largest && nums[i] > slargest) {
                tlargest = slargest;
                slargest = nums[i];
            }
            else if(nums[i] < slargest && nums[i] > tlargest) {
                tlargest = nums[i];
            }
        }

        if(tlargest == Long.MIN_VALUE) {
            return (int)largest;
        }

        return (int)tlargest;
    }
}