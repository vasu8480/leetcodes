from typing import List
class Solution:
    def move(self, num: List[int]) -> None:
        j = 0
        for nu in num:
            if nu != 0:
                num[j] = nu
                j += 1

        for x in range(j, len(num)):
            num[x] = 0
        print(num)
s=Solution()
s.move([0,20,5,0,9,0,88,75,7])