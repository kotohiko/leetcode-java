/**
 * <a href="https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer"><h1>2529. Maximum Count of Positive Integer and Negative Integer</h1></a>
 *
 * @author Kotohiko
 * @since 11:20 Jun 29, 2024
 */
class MaximumCountOfPositiveIntegerAndNegativeInteger_Solution {
    public int maximumCount(int[] nums) {
        var positiveCount = 0;
        var negativeCount = 0;
        for (int num : nums) {
            if (num > 0) {
                ++positiveCount;
            } else if (num < 0) {
                ++negativeCount;
            }
        }
        return Math.max(positiveCount, negativeCount);
    }
}