/**
 * <a href="https://leetcode.cn/problems/count-alternating-subarrays"><h1>3101. Count Alternating Subarrays</h1></a>
 *
 * @author Kotohiko
 * @since 10:01 Jul 06, 2024
 */
class CountAlternatingSubarrays_Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long res = 0;
        long cur = 0;
        var pre = -1;
        for (var a : nums) {
            cur = (pre != a) ? cur + 1 : 1;
            pre = a;
            res += cur;
        }
        return res;
    }
}