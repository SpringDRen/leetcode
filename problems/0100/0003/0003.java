import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        Map<Character, Integer> subString = new HashMap<>();
        int n = s.length(), maxSub = 0;
        for (int start = 0, end = 0; end < n; end++) {
            char one = s.charAt(end);
            if (subString.containsKey(one)) {
                start = Math.max(start, subString.get(one) + 1);
            }
            maxSub = Math.max(maxSub, end - start + 1);
            subString.put(one, end);
        }

        return maxSub;
    }
}

class Solution2 {
    // 使用数组代替 map
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int[] subs = new int[128];
        // 所有位置置为 -1
        for (int i = 0; i < 128; i++) {
            subs[i] = -1;
        }

        int n = s.length(), maxSub = 0;
        for (int start = 0, end = 0; end < n; end++) {
            int one = s.charAt(end);
            // 数组中的初始值为 -1，+1正好为 0 ；
            // 如果取出来不是 -1，表示重复元素， +1 正好表示窗口移动
            start = Math.max(start, subs[one] + 1);
            maxSub = Math.max(maxSub, end - start + 1);
            subs[one] = end;
        }

        return maxSub;
    }
}