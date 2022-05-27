from typing import List


def isBadVersion(Version):
    first = 0
    return Version >= first


class Solution:
    def firstBadVersion(self, n):
        left = 1
        right = n

        while left < right:
            mid = left + (right - left) // 2
            if not isBadVersion(mid):
                left = mid + 1
            else:
                right = mid
        return left


s = Solution()
ans = s.firstBadVersion(0)
print(ans)
