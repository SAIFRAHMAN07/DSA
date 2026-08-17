from typing import List
class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        a=0
        total =0
        t=0
        for i in range(0,(len(gas))):
            cos = gas[i] - cost[i]      
            total = total +cos
            t = t + cos
            if total<0:
                a=i+1
                total =0
        if t>=0:
            return a 
        else:
            return -1

            
        