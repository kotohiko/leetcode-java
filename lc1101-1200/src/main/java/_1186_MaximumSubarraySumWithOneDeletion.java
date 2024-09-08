/**
 * <a href="https://leetcode.cn/problems/maximum-subarray-sum-with-one-deletion">
 * <h1>1186. Maximum Subarray Sum with One Deletion</h1></a>
 *
 * @author Kotohiko
 * @since 10:19 Jul 21, 2024
 */
class MaximumSubarraySumWithOneDeletion_Solution {
    public int maximumSum(int[] arr) {
        var dp0 = arr[0];
        var dp1 = 0;
        var res = arr[0];
        for (var i = 1; i < arr.length; ++i) {
            dp1 = Math.max(dp0, dp1 + arr[i]);
            dp0 = Math.max(dp0, 0) + arr[i];
            res = Math.max(res, Math.max(dp0, dp1));
        }
        return res;
    }
}