import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> subMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (subMap.containsKey(sub)) {
                result[0] = subMap.get(sub);
                result[1] = i;
                break;
            } else {
                subMap.put(nums[i], i);
            }
        }

        return result;
    }
}
