/**
 * <h1>136. Single Number</h1>
 * <a href="https://leetcode.cn/problems/single-number">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 23:38 Oct 14, 2023
 */
class SingleNumber_Solution {
    public int singleNumber(int[] nums) {
        var single = 0;
        for (var num : nums) {
            single ^= num;
        }
        return single;
    }
}