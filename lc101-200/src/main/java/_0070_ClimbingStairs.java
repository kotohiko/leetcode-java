/**
 * <h1>70. Climbing Stairs</h1>
 * <a href="https://leetcode.cn/problems/climbing-stairs/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @create 17:15 Sep 28, 2023
 */
class ClimbingStairs_Solution {
    public int climbStairs(int n) {
        var p = 0;
        var q = 0;
        var r = 1;
        for (var i = 0; i < n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}