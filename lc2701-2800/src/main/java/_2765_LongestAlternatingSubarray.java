/**
 * <a href="https://leetcode.cn/problems/longest-alternating-subarray/description/"><h1>2765. Longest Alternating Subarray</h1></a>
 *
 * @author Jacob Suen
 * @since 16:29 Jan 23, 2023
 */
class LongestAlternatingSubarray_Solution {
    public int alternatingSubarray(int[] nums) {
        var res = -1;
        var n = nums.length;
        var firstIndex = 0;
        for (var i = 1; i < n; ++i) {
            var length = i - firstIndex + 1;
            if (nums[i] - nums[firstIndex] == (length - 1) % 2) {
                res = Math.max(res, length);
            } else {
                if (nums[i] - nums[i - 1] == 1) {
                    firstIndex = i - 1;
                    res = Math.max(res, 2);
                } else {
                    firstIndex = i;
                }
            }
        }
        return res;
    }
}
