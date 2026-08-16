from typing import List
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        a=0
        arr = [0] * (len(nums))
        for i in range(0,(len(nums))):
            a = a + nums[i]
            arr[i]= a
        return arr

        