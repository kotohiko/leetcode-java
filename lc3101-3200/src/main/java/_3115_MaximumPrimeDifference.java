/**
 * <a href="https://leetcode.cn/problems/maximum-prime-difference"><h1>3115. 质数的最大距离</h1></a>
 *
 * @author Jacob Suen
 * @since 09:49 Jul 02, 2024
 */
class MaximumPrimeDifference_Solution {
    public int maximumPrimeDifference(int[] nums) {
        var n = nums.length;
        var first = -1;
        var ans = 0;
        for (var i = 0; i < n; ++i) {
            if (isPrime(nums[i])) {
                if (first != -1) {
                    ans = Math.max(ans, i - first);
                } else {
                    first = i;
                }
            }
        }
        return ans;
    }

    private boolean isPrime(int n) {
        for (var i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }
}