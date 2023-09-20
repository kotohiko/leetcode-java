import java.util.HashMap;

/**
 * <h2>1. Two Sum</h2>
 * <a href="https://leetcode.cn/problems/two-sum/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 10:55 20/09/2023
 */
class TwoSum_Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var n = nums.length;
        for (var i = 0; i < n; ++i) {
            var b = target - nums[i];
            if (map.containsKey(b)) {
                return new int[]{map.get(b), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}