from typing import List


class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        l = sorted(s)
        k = sorted(t)
        if l == k:
            return True
        else:
            return False


s = Solution()
print(s.isAnagram("anag", "gan"))
