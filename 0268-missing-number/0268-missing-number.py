class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sums =  (n*(n+1))/2
        b = sum(nums)
        m = sums - b
        return int(m)
        