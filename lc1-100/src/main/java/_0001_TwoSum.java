import java.util.HashMap;

/**
 * <h1>1. Two Sum</h1>
 * <a href="https://leetcode.cn/problems/two-sum/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 10:55 Sep 20, 2023
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
        return new int[0];
    }
}