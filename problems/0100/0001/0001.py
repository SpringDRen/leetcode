

from ast import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sub_dict = {}
        for i in range(len(nums)):
            sub = target - nums[i]
            if sub in sub_dict:
                return [sub_dict[sub], i]
            else:
                sub_dict[nums[i]] = i

        return []
