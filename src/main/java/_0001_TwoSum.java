import java.util.HashMap;
import java.util.Map;

/**
 * <h2>1. 两数之和</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/two-sum/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class TwoSum_Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int b = t - nums[i];
            if (map.containsKey(b)) {
                return new int[]{map.get(b), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
